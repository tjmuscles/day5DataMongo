package com.bah.metro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bah.metro.domain.Registration;

public interface RegistrationRepository extends MongoRepository<Registration, Long> {

}
