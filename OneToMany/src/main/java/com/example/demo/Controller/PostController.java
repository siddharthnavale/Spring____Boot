package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Post;
import com.example.demo.Service.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/posts")
	public List<Post> getAllPosts() {
		
		return postService.getAllPosts();
		
	}
	
	@PostMapping("/posts")
	public Post addPost(@RequestBody Post post) {
		
		return postService.savePost(post);
		
	}
	

}
