package com.clairgustafson.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.clairgustafson.inventory.entity.Order;

public interface OrderRepo extends CrudRepository<Order, Long> {

}
