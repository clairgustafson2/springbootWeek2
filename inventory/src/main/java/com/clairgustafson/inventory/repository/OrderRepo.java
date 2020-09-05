package com.clairgustafson.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.clairgustafson.inventory.entity.Orders;

public interface OrderRepo extends CrudRepository<Orders, Long> {
	
}
