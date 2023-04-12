package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Post;
import com.example.demo.Repository.PostRepository;

@Service
public class ImplPostService implements PostService{

	
	@Autowired
	private PostRepository postRepository;
	
	
	
	@Override
	public List<Post> getAllPosts() {
	
		return postRepository.findAll();
	}



	@Override
	public Post savePost(Post post) {
		
		return postRepository.save(post);
	}





}
