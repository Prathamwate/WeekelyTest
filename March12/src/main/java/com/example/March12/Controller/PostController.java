package com.example.March12.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.March12.Model.Post;
import com.example.March12.Service.PostService;

@RestController
@RequestMapping("/api/post")
public class PostController {
	@Autowired
	PostService postService;
	
	@PostMapping(value = "/add")
	public Post addPost(@RequestBody Post post) {
		Post post2=postService.addPost(post);
		return post2;
		
	}
	
	@GetMapping(value = "/get")
	public List<Post> getPost() {
	List<Post> allpost=postService.getPost();
		return allpost;
		
	}

}
