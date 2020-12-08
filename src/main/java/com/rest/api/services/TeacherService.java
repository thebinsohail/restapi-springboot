package com.rest.api.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.rest.api.models.Teacher;

@Service
public class TeacherService {
	private List<Teacher> teachers= Arrays.asList(
			
			new Teacher("Ali Khan",38,"CE","Bachelor of Science in Computer Engineering","BSCE"),
			new Teacher("Tauseef Ali",38,"CE","Bachelor of Science in Computer Engineering","BSCE"),
			new Teacher("Farrukh Khan",38,"CE","Bachelor of Science in Software Engineering","BSSE"),
			new Teacher("Zainab Zahra",38,"CE","Bachelor of Science in Computer Engineering","BSCE"),
			new Teacher("Ibrar ul Haq",38,"EL","Bachelor of Science in Electrical Engineering","BSEL")
			
			);
	
	public List<Teacher> getAllTeachers() {
		
		return teachers;
	}
	
	@RequestMapping("/teachers/{dept}")
	public Teacher getTeacher(@PathVariable String dept ) {
		
		return teachers.stream().filter(t -> t.getName().equals(dept)).findAny().get();
	}
	
}
