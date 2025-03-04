package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Student;

@RestController
@CrossOrigin("*")
public class StudentController {
	
	
	
	public StudentController() {
		System.out.println("StudentController called here");
	}
	
	List<Student>students=new ArrayList<>(List.of(new Student(1, "Swami", "Pune", 100), new Student(2, "Shiv", "Mumbai", 100)));
	
	@GetMapping("/students")
	public List<Student>getAllStudents()
	{
		return students;
	}
	
	@PostMapping("/post_data")
	public Student postStudents(@RequestBody Student std)
	{
		students.add(std);
		System.out.println(std);
		return std;
	}
	
	
	

}
