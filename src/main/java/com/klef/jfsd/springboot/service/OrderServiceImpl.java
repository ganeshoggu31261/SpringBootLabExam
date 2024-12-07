package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.klef.jfsd.springboot.model.Orders;
import com.klef.jfsd.springboot.repository.OrderRepository;

public class OrderServiceImpl implements OrderService{
	

	 @Autowired
	    private OrderRepository orderRepository;

	    public List<Orders> getAllOrders() {
	        return orderRepository.findAll();
	    }

}
