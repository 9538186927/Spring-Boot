package com.stash.springbootelasticserachexample.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.stash.springbootelasticserachexample.model.Employee;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, String>{
 
    List<Employee> findByFirstname(String firstName);
 
}