package com.managment.UniversityEventManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managment.UniversityEventManagement.model.Student;
import com.managment.UniversityEventManagement.repository.IStudentRepo;

@Service
public class StudentService {

	@Autowired
	private IStudentRepo student_repo;

	public void addStudent(Student student) {
		student_repo.save(student);

	}

	public void deleteStudent(int studentId) {
		student_repo.deleteById(studentId);

	}

	public void updateStudent(int studentId, Student student) {

		Student s = student_repo.findById(studentId).get();
		s.setFirstname(student.getFirstname());
		s.setLastname(student.getLastname());
		s.setAge(student.getAge());
		s.setDepartment(student.getDepartment());

		student_repo.save(s);

	}

	public List<Student> allStudent() {
		// TODO Auto-generated method stub
		return student_repo.findAll();
	}

	public Student studentId(int studnetId) {
		return student_repo.findById(studnetId).get();
	}

}
