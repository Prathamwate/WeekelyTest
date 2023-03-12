package com.example.March12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.March12.Model.Post;
import com.example.March12.Repository.IPostRepo;

@Service
public class PostService {
  @Autowired
  IPostRepo iPostRepo;

public Post addPost(Post post) {
	Post post2=iPostRepo.save(post);
	return post2;
}

public List<Post> getPost() {
	List<Post> allPosts=iPostRepo.findAll();
	return allPosts;
}
  
}
