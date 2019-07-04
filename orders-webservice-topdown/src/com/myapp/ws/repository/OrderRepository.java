package com.myapp.ws.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.joda.time.LocalDate;

import com.myapp.ws.Order;

public class OrderRepository 
{
	
	private List<Order> list= new ArrayList<>();
	
	public OrderRepository()
	{
		
		list.add(new Order(1,"Iphone","Iphonex",98000.00,"http://apple.com",LocalDate.now(),5.0));
		list.add(new Order(2,"Iphone","Iphone10",95000.00,"http://apple.com",LocalDate.now(),4.8));
		list.add(new Order(3,"Samsung","galaxy10",68000.00,"http://Samsung.com",LocalDate.now(),4.5));
		list.add(new Order(1,"Samsung","galaxy8",48000.00,"http://Samsung.com",LocalDate.now(),4.0));
		
	}
	
	
	public List<Order>searchRepository(String name)
	{
		return list.stream().filter(o->o.getProductName().equalsIgnoreCase(name)).collect(Collectors.toList());
		
		
		
	}

}
