package com.clairgustafson.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.clairgustafson.inventory.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
	public Customer findCustomerById(Long id);

}
