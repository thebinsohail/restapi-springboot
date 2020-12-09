package com.rest.api.controllers;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.models.Teacher;
import com.rest.api.services.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	TeacherService teacherservice;
	
	@RequestMapping("/teachers")
	public List<Teacher> getAllTeachers() {
		return teacherservice.getAllTeachers();
	}
	
	@RequestMapping("/teachers/{name}")
	public Teacher getTeacher(@PathVariable String name ) {
		
		return teacherservice.getTeacher(name);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/teachers")
	public String addStudent(@RequestBody Teacher teacher) {
		
		teacherservice.addTeacher(teacher);
		
		return "Teacher named "+teacher.getName()+" added successfully!";
	}
}
