package com.student.Mapping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.Mapping.Model.Course;

public interface ICourseRepo extends JpaRepository<Course, Integer>{

}
