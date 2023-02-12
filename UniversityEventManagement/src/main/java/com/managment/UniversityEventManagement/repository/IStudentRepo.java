package com.managment.UniversityEventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.managment.UniversityEventManagement.model.Student;


@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer> {

}
