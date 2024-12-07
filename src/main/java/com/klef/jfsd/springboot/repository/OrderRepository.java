package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.springboot.model.Orders;

public interface OrderRepository  extends JpaRepository<Orders, Integer>
{
	

}
