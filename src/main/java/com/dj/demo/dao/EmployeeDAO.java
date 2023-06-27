package com.dj.demo.dao;

import java.util.List;

import com.dj.demo.entity.Employee;

public interface EmployeeDAO {
	
	List<Employee> findAll();
}
