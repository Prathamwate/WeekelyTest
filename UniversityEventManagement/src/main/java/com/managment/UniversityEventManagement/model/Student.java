package com.managment.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int StudentId;
	private String firstname;
	private String lastname;
	private String age;
	private String department;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

//insert into student(firstname varchar(100),lastname varchar(100),age varchar(5),department varchar(20));