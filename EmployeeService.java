package com.example.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empdao;
	public String addDetail(Employee e) {
		return empdao.addDetail(e);
	}
	public String empList(ArrayList<Employee> emp){
		return empdao.empList(emp);
	}
	public List<Employee> empDetail() {
		return empdao.empDetail();
	}
	public Employee empId(int id) {
		return empdao.empId(id);
	}
	public String delempId(int id) {
		return empdao.delempId(id);
	}
	public String deleteall() {
		return empdao.deleteall();
	}
}
