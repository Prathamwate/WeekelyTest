package com.example.March12.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.March12.Model.Post;

@Repository
public interface IPostRepo extends JpaRepository<Post, Integer>{

}
