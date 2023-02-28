package com.bah.metro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bah.metro.domain.Event;

public interface EventRepository extends MongoRepository<Event, Long> {

}
