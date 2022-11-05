package com.example.Student;

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
public class StudentController {
	@Autowired
	StudentService stuser;
	@PostMapping(value="/getstudent")
	public String getStud(@RequestBody Student s) {
		return stuser.getStud(s);
	}
	@PostMapping(value="/postStu")
	public String getStudList(@RequestBody ArrayList<Student> stu) {
		return stuser.getStudList(stu);
	}
	@GetMapping(value="/findall")
	public List<Student> findstudent(){
		return stuser.findstudent();
	}
	@GetMapping(value="/findid/{id}")
	public Student findstudentbyid(@PathVariable int id) {
		return stuser.findstudentbyid(id);
	}
	@DeleteMapping(value="/delstu/{id}")
	public String delstubyid(@PathVariable int id) {
		return stuser.delstubyid(id);
	}
	@GetMapping(value="/getfem")                        //get Female Students
	public List<Student> getFemaleStudent(){
		return stuser.getFemaleStudent();
	}
	@PostMapping(value="/postbyage")                    //Save the Stud depend on age
	public String postByAge(@RequestBody Student s) {
		return stuser.postByAge(s);
	}
	@PostMapping(value="/postbyagelist")
	public String ListOfStuPostByAge(@RequestBody Student s) {
		return stuser.postByAge(s);
	}
//	@GetMapping(value="/getmathi")
//	public Student getStu()
}
