package com.bah.metro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bah.metro.domain.Customer;

public interface CustomersRepository extends MongoRepository<Customer, Long> {

}
