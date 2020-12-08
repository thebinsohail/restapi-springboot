package com.rest.api.services;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rest.api.models.Student;

@Service
public class StudentService {

	private List<Student> students= Arrays.asList(
			
				new Student("Anas",2019,"SE"),
				new Student("Abdullah",2019,"SE"),
				new Student("Rafay",2020,"SE"),
				new Student("Usman",2019,"EE")
				
				
				);
	
	public List<Student> getAllStudents() {
		return students;
	}
	
	@RequestMapping("/students/{name}")
	public Student getStudent(@PathVariable String name ) {
		
		return students.stream().filter(s -> s.getName().equals(name)).findAny().get();
	}
}
