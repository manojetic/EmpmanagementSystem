package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.Entity.Employee;
import com.main.repository.EmployeeRepository;
import com.main.serviceImplement.ServiceImp;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private ServiceImp si;
	
	
	@GetMapping("/home")
	public String homepage() {
		return "Welcome";
	}
	@PostMapping("/addEmp")
	public ResponseEntity<Employee> addEmployeeEntity(@RequestBody Employee employee){
		Employee em=si.addEmployee(employee);
		  return new ResponseEntity<Employee>(em, HttpStatus.CREATED);
	}
	@DeleteMapping("/delEmp/{id}")
	public ResponseEntity<String> removeEmployee(@PathVariable int id){
		
		si.removeEmployee(id);
		return new ResponseEntity<String>("Remove Successfully",HttpStatus.ACCEPTED);
	}
	@GetMapping("/list")
	public ResponseEntity<List<Employee>> getEmployee(){
		List<Employee> li= si.getEmployee();
		return new ResponseEntity<List<Employee>>(li,HttpStatus.ACCEPTED);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(@PathVariable int id){
		return new ResponseEntity<String>("Updated Successfully",HttpStatus.ACCEPTED);
		
	}
}
