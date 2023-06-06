package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
