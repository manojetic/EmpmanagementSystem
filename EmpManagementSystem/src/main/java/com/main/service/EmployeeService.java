package com.main.service;

import java.util.List;

import com.main.Entity.Employee;

public interface EmployeeService {
	
	
 public Employee addEmployee(Employee e);
 public String removeEmployee(int id);
 public String update(int id);
 public List<Employee> getEmployee();
}