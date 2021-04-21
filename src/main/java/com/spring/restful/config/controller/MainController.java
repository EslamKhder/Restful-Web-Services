package com.spring.restful.config.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.model.Student;

// http://localhost:8080/restful/
@RestController  
@RequestMapping("/main")
// http://localhost:8080/restful/main   
public class MainController {
	
	// http://localhost:8080/restful/main/facebook
	@GetMapping("/facebook")
	public String getMain() {
		return "HIIIIIII Eslam";
	}
	
	// http://localhost:8080/restful/main/students
	@GetMapping("/students")
	public List<Student> getStudents(){
	    Student s1 = new Student(1,"eslam","01113903660");
	    Student s2 = new Student(1,"ahmed","01254887442");
	    Student s3 = new Student(1,"karim","01568943323");
	    Student s4 = new Student(1,"yaser","01254654231");
	    Student s5 = new Student(1,"jo","01012454878");
	    List<Student> li = new ArrayList<Student>();
	    li.add(s1);li.add(s2);li.add(s3);li.add(s4);li.add(s5);
	    return li;
	}
	
}
