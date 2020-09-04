package com.clairgustafson.inventory.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clairgustafson.inventory.entity.Customer;
import com.clairgustafson.inventory.repository.CustomerRepo;

@Service
public class CustomerService {
	
	private static final Logger logger = LogManager.getLogger(CustomerService.class);
	
	@Autowired
	private CustomerRepo repo;
	
	public Customer getCustomerById(Long id) throws Exception {
		try {
			return repo.findById(id).orElseThrow();
		} catch (Exception e) {
			logger.error("Exception occurred while trying to retrieve customer: " + id, e);
			throw e;
		}
	}
	
	public Iterable<Customer> getCustomers(){
		return repo.findAll();
	}
	
	public Customer createCustomer(Customer customer) {
		return repo.save(customer);
	}
	
	public Customer updateCustomer(Customer customer, Long id) throws Exception{
		try {
			Customer oldCustomer = repo.findById(id).orElseThrow();
			oldCustomer.setAddress(customer.getAddress());
			oldCustomer.setFirstName(customer.getFirstName());
			oldCustomer.setLastName(customer.getLastName());
			oldCustomer.setLevel(customer.getLevel());
			return repo.save(oldCustomer);
		} catch (Exception e) {
			logger.error("Exception occurred while trying to update customer: " + id, e);
			throw new Exception("Unable to update customer.");
		}
	}
	
	public void deleteCustomer(Long id) throws Exception {
		try {
			repo.deleteById(id);
		} catch (Exception e) {
			logger.error("Exception occurred while trying to delete customer: " + id, e);
			throw new Exception("Unable to delete customer.");
		}
	}

}
