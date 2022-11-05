package com.example.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository stuRepo;
	public String getStud(Student s) {
		stuRepo.save(s);
		return "Successfully Saved!!";
	}
	public String getStudList(ArrayList<Student> stu) {
		stuRepo.saveAll(stu);
		return "Saved Successfully";
	}
	public List<Student> findstudent(){
		return stuRepo.findAll();
	}
	public Student findstudentbyid(int id) {
		return stuRepo.findById(id).get();
	}
	public String delstubyid(int id) {
		stuRepo.deleteById(id);
		return "Deleted Successfully";
	}
	public List<Student> getFemaleStudent(){
		return stuRepo.findAll();
	}
	public String postByAge(Student s) {
		stuRepo.save(s);
		return "Saved Successfully";
	}
}
