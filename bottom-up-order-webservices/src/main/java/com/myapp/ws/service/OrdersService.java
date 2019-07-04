package com.myapp.ws.service;

import java.util.List;

import com.myapp.ws.model.Order;

public interface OrdersService {
	
	String addNewProduct(Order order);
	List<Order> findByName(String Name);
	

}
