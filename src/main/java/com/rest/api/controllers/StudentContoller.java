package com.rest.api.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.models.Student;
import com.rest.api.services.StudentService;

@RestController
public class StudentContoller {

	@Autowired
	private StudentService studentservice;

	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		return studentservice.getAllStudents();
	}
	
	@RequestMapping("/students/{name}")
	public Student getStudent(@PathVariable String name ) {
		
		return studentservice.getStudent(name);
	}
	
	@RequestMapping(method =RequestMethod.POST , value="/students")
	public String addStudent(@RequestBody Student student) {
		
		studentservice.addStudent(student);
		
		return "Student named "+student.getName()+" added successfully!";
	}
}
