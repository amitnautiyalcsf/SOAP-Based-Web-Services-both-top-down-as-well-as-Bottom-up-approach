package com.myapp.ws.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.myapp.ws.model.AddOrderRequest;
import com.myapp.ws.model.AddOrderResponse;
import com.myapp.ws.model.GetSearchRequest;
import com.myapp.ws.model.GetSearchResponse;
import com.myapp.ws.model.Order;
import com.myapp.ws.service.OrdersService;

@Component
@Endpoint
public class OrdersEndPoint {

@Autowired
private OrdersService ordersService;

private static final String NAMESPACE_URI="http://myapp.com/orders/";


@PayloadRoot(namespace = NAMESPACE_URI,localPart = "getSearchRequest")
@ResponsePayload
public GetSearchResponse getSearch(@RequestPayload 
GetSearchRequest productName) {

System.out.println(productName);

List<Order> list= ordersService.findByName(productName.getName());

GetSearchResponse orderInfoWrapper = new GetSearchResponse();
orderInfoWrapper.getOrders().addAll(list);
return orderInfoWrapper;


}

@PayloadRoot(namespace = NAMESPACE_URI,localPart = "addOrderRequest")
@ResponsePayload
public AddOrderResponse addOrder(@RequestPayload 
AddOrderRequest order) {

System.out.println(order);

String orderName= ordersService.addNewProduct(order.getOrder());


AddOrderResponse response=new AddOrderResponse();
response.setOrdername(orderName);
return response;


}



}