package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Course;
import com.example.demo.Service.CourseService;


@RestController
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		
		return this.service.getCourses();
		
	}
	
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable int id) {
		return  this.service.getCourse(id);
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course ) 
	{
		return this.service.addCourse(course);
	 
	}

}
