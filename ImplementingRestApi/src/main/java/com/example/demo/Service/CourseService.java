package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Course;

public interface CourseService {
	

	public List<Course> getCourses();
	
	public Course getCourse(int courseId);

	public Course addCourse(Course course);
	
	

}
