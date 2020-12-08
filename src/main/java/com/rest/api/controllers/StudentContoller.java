package com.rest.api.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.models.Student;
import com.rest.api.services.StudentService;

@RestController
public class StudentContoller {

	@Autowired
	private StudentService studentservice;

	@RequestMapping(value={"/","/students"})
	public List<Student> getAllStudents(){
		return studentservice.getAllStudents();
	}
	
	@RequestMapping("/students/{name}")
	public Student getStudent(@PathVariable String name ) {
		
		return studentservice.getStudent(name);
	}
}
