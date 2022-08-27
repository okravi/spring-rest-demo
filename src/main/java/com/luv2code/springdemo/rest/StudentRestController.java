package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> studentList;
	
	//define @PostConstruct to load the student data
	@PostConstruct
	public void loadData() {
		
		studentList = new ArrayList<>();
		studentList.add(new Student("Mary", "Stuart")); 
		studentList.add(new Student("Jane", "Doe"));
		studentList.add(new Student("Alex", "Motiloff"));
	}
	
	//define endpoint for all students
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return studentList;
	}
	
	//define endpoint for a single student
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if (studentId<=studentList.size()-1) {
			return studentList.get(studentId);
		}
		
		return null;
	}
}
