package com.student.Mapping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.Mapping.Model.Laptop;


public interface ILaptopRepo  extends JpaRepository<Laptop, Integer>{

}