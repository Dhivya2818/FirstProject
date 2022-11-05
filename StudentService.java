package com.example.Student;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.stream.*;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
	@Autowired
	StudentDao studao;
	public String getStud(Student s) {
		return studao.getStud(s);
	}
	public String getStudList(ArrayList<Student> stu) {
		return studao.getStudList(stu);
	}
	public List<Student> findstudent(){
		return studao.findstudent();
	}
	public Student findstudentbyid(int id) {
		return studao.findstudentbyid(id);
	}
	public String delstubyid(int id) {
		return studao.delstubyid(id);
	}
	public List<Student> getFemaleStudent(){
		return studao.getFemaleStudent().stream().filter(x->x.getGender().equalsIgnoreCase("female")).toList();
	}
	public String postByAge(Student s) {
		if(s.getAge()>=18) {
			return "Check the Student Age!!";
		}
		else {
			return studao.postByAge(s);
		}
	}
}
