package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Orders;
import com.klef.jfsd.springboot.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class ClientController {

	
	public class OrderController {
	    @Autowired
	    private OrderService orderService;

	    @GetMapping
	    public List<Orders> getAllOrders() {
	        return orderService.getAllOrders();
	    }
	}
}
