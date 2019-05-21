package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.EmployeeRepository;
import com.example.demo.model.Employee;

@RestController
public class mySqlController {
	@Autowired
	 EmployeeRepository empRepo;
	
	@GetMapping("/save/{name}/{location}/{id}")
	private Employee saveEmp(@PathVariable (value = "id") int id,@PathVariable (value = "name") String name,@PathVariable (value = "location") String location) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setLocation(location);
		empRepo.save(emp);
		empRepo.flush();
		return emp;
	}
	
	
	@PostMapping("/save")
	private Employee saveEmp(@RequestBody Employee emp) {	
		empRepo.save(emp);
		empRepo.flush();
		return emp;
	}
	
	@GetMapping("/all")
	private List<Employee> findAll(){
		return empRepo.findAll();
		
	}
	
	@GetMapping("/findone/{id}")
	private Employee findOne(@PathVariable (value = "id") int id){
		
		return empRepo.findById(id);
		
	}
	
//	@GetMapping("/findbyname/{name}")
//	private List<Employee> findByName(@PathVariable (value = "name") String name){
//		
//		return empRepo.getFirstNamesLike(name);
//		
//	}
		
	@GetMapping("/delete/{id}")
	private Employee deleteEmp(@PathVariable (value = "id") int id) {
		Employee emp = empRepo.findById(id);
		empRepo.delete(emp);

		return emp;
	}


}
