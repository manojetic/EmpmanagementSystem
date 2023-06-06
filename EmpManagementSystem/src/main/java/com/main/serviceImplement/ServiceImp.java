package com.main.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Entity.Employee;
import com.main.repository.EmployeeRepository;
import com.main.service.EmployeeService;

@Service
public class ServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public Employee addEmployee(Employee e) {
		Employee emp = emprepo.save(e);
		return emp;
	}

	@Override
	public String removeEmployee(int id) {
		emprepo.deleteById(id);
		return "Deleted Successfully!";
	}

	@Override
	public String update(int id) {
		Optional<Employee> emp= emprepo.findById(id);   
		if(emp.isPresent()) {
			Employee emps= new Employee();
			emprepo.save(emps);
			return "Updaqted Successfully!";
		}else {
				return "Employee Not found";
		}
	
	}

	@Override
	public List<Employee> getEmployee() {
		List<Employee> emplist=emprepo.findAll();
		return emplist;
	}

}
