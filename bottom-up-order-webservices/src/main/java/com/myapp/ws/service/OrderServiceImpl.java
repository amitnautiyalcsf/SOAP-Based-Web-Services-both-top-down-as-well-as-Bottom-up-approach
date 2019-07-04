package com.myapp.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.ws.model.Order;
import com.myapp.ws.repository.OrdersRepository;
@Service
public class OrderServiceImpl implements OrdersService {
     @Autowired
	public OrdersRepository ordersRepository;
	@Override
	public String addNewProduct(Order order) {
		// TODO Auto-generated method stub
		ordersRepository.save(order);
		return order.getProductName();
	}

	@Override
	public List<Order> findByName(String Name) {
		// TODO Auto-generated method stub
		
		return ordersRepository.findByProductName(Name);
	}

}
