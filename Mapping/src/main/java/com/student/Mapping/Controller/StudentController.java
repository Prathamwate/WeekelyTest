package com.student.Mapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.Mapping.Model.Student;
import com.student.Mapping.Service.StudentService;

import jakarta.annotation.Nullable;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student){
		Student student2=studentService.addStudent(student);
		return student2;
	}
	
	 @GetMapping("/student")
	 public List<Student> getStudent(@Nullable @RequestParam String studentId)  {
	 List<Student> student = studentService.getStudent(studentId);
	   return student;
	 }
	

}
