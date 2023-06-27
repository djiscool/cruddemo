package com.dj.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dj.demo.entity.Employee;

@RepositoryRestResource(path="members")
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	
}
