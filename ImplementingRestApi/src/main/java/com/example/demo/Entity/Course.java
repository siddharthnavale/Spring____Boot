package com.example.demo.Entity;

public class Course {

private int courseId;
private String courseName;
private  String coursePrice;


public Course() {
	super();
	// TODO Auto-generated constructor stub
}

public Course(int courseId, String courseName, String coursePrice) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.coursePrice = coursePrice;
}

public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCoursePrice() {
	return coursePrice;
}
public void setCoursePrice(String coursePrice) {
	this.coursePrice = coursePrice;
}


}
