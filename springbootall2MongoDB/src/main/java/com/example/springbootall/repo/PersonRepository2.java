package com.example.springbootall.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootall.pojo.Persons;

@Repository
public interface PersonRepository2 extends MongoRepository<Persons, String>{

}
