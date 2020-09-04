package com.clairgustafson.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.clairgustafson.inventory.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

}
