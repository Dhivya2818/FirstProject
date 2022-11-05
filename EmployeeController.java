package com.example.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empser;
	@PostMapping(value="/add")
	public String addDetail(@RequestBody Employee e) {
		return empser.addDetail(e);
	}
	@PostMapping(value="/addList")
	public String empList(@RequestBody ArrayList<Employee> emp){
		return empser.empList(emp);
	}
	@GetMapping(value="/getList")
	public List<Employee> empDetail() {
		return empser.empDetail();
	}
	@GetMapping(value="/getbyIdval/{id}")
	public Employee empId(@PathVariable int id) {
		return empser.empId(id);
	}
	@DeleteMapping(value="/delbyIdval/{id}")
	public String delempId(@PathVariable int id) {
		return empser.delempId(id);
	}
	@DeleteMapping(value="/deleteall")
	public String deleteall() {
		return empser.deleteall();
	}
	
}
