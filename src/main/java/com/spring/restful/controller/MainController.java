package com.spring.restful.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.model.Student;

// http://localhost:8080/restful/
@RestController  
@RequestMapping("/main")
// http://localhost:8080/restful/main   
public class MainController {
	
	private List<Student> li = new ArrayList<Student>();
	
	
	// http://localhost:8080/restful/main/facebook
	@GetMapping("/facebook")
	public String getMain() {
		return "HIIIIIII Eslam";
	}
	
	@PostConstruct
	public void start() {
		Student s1 = new Student(1,"eslam","01113903660");
	    Student s2 = new Student(2,"ahmed","01254887442");
	    Student s3 = new Student(3,"karim","01568943323");
	    Student s4 = new Student(4,"yaser","01254654231");
	    Student s5 = new Student(5,"jo","01012454878");
	    
	    li.add(s1);li.add(s2);li.add(s3);li.add(s4);li.add(s5);
	}
	
	// http://localhost:8080/restful/main/students
	@GetMapping("/students")
	public List<Student> getStudents(){
	    return li;
	}
	
	// http://localhost:8080/restful/main/getStudent/id
	@GetMapping("/getStudent/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
	    return li.get(id - 1);
	}
	
	// http://localhost:8080/restful/main/getStudentid?id=1
	@GetMapping("/getStudentid")
	public Student getStudentId(@RequestParam int id) {
	    return li.get(id - 1);
	}
	
}
