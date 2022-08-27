package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	//define endpoint
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> studentList = new ArrayList<>(); 
		
		studentList.add(new Student("Mary", "Stuart")); 
		studentList.add(new Student("Jane", "Doe"));
		studentList.add(new Student("Alex", "Motiloff"));
		
		return studentList;
	}
}
