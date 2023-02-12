package com.managment.UniversityEventManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.managment.UniversityEventManagement.model.Student;
import com.managment.UniversityEventManagement.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	
	@Autowired
	private StudentService student_service;
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student student) {
		student_service.addStudent(student);
	}
	
	@GetMapping("/allStudent")
	public List<Student> allStudent() {
		return student_service.allStudent();
	}
	
	@GetMapping("/sId/{studnetId}")
	public Student studentId(@PathVariable int studnetId) {
		return student_service.studentId(studnetId);
	}
	
	@PutMapping("/updateStudent/{studentId}")
	public void updateStudent(@PathVariable int studentId,@RequestBody Student student) {
		student_service.updateStudent(studentId,student);
	}
	
	@DeleteMapping("/deleteStudent/{studentId}")
	public void deleteStudent(@PathVariable int studentId) {
		student_service.deleteStudent(studentId);
	}

}
