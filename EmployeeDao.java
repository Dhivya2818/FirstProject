package com.example.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;
	public String addDetail(Employee e) {
		empRepo.save(e);
		return "Successfully Saved";
	}
	public String empList(ArrayList<Employee> emp){
		empRepo.saveAll(emp);
		return "Success";
	}
	public List<Employee> empDetail() {
		return empRepo.findAll();
	}
	public Employee empId(int id) {
		return empRepo.findById(id).get();
	}
	public String delempId(int id) {
		empRepo.deleteById(id);
		return "Deleted Successfully";
	}
	public String deleteall() {
		empRepo.deleteAll();
		return "Deleted all Successfully";
	}
}
