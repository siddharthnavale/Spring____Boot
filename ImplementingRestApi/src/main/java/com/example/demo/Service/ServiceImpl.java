package com.example.demo.Service;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Course;

@Service
public class ServiceImpl implements CourseService {
	
	private List<Course> list;
	
	public ServiceImpl() {
		list= new ArrayList<Course>();
		list.add(new Course(1,"Core java","10000"));
		list.add(new Course(2,"Advanced java","7000"));
		}

	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(int courseId) {
       Course c= null;
		
      for(Course course: list) {
    	  if(course.getCourseId()==courseId) {
    		  c=course;
    		  break;
    	  }
      }
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		
		list.add(course);
		return course;
	}

}
