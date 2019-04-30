package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.EmployeeRepository;
import com.example.demo.model.Employee;

@RestController
public class mySqlController {
	@Autowired
	 EmployeeRepository empRepo;
	
	@GetMapping("/save")
	private void saveEmp() {
		
	}
	
	@GetMapping("/all")
	private List<Employee> findAll(){
		return empRepo.findAll();
		
	}
	
//	@GetMapping("/findone/{id}")
//	private Employee findOne(@PathVariable (value = "id") int id){
//		return empRepo.findById(id);
//		
//	}
		
	
	
//	@GetMapping("/restservice")
//	public Employee restService() {
//		Employee emp = new Employee();
//		emp.setId(1);
//		emp.setName("ashish");
//		emp.setLocation("haryana");
//		return emp;
//		
//	}

}
