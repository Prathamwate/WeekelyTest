package com.student.Mapping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.Mapping.Model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer>{

}
