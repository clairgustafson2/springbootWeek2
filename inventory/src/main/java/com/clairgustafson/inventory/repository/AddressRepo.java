package com.clairgustafson.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.clairgustafson.inventory.entity.Address;

public interface AddressRepo extends CrudRepository<Address, Long> {

}
