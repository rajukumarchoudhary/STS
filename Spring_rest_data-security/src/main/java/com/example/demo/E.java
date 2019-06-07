package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;
@Component
@RepositoryRestResource(collectionResourceRel = "p",path="p")

public interface E  extends JpaRepository<Employee, Integer>{
	
	

}
