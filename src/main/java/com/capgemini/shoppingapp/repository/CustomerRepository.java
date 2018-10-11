package com.capgemini.shoppingapp.repository;


import org.springframework.data.repository.CrudRepository;

import com.capgemini.shoppingapp.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
