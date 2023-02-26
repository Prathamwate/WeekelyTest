package com.student.Mapping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.Mapping.Model.Book;

public interface IBookRepo extends JpaRepository<Book, Integer>{

}
