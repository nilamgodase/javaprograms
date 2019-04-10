package com.bridgelabz.AnnotationValue;


import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String name;
	private String hobby;
	private String interestedCourse;
	
	@Value("nilamgodase")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("chess play")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	@Value("full stack")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}


	public void displayStudentInfo()
	{
		System.out.println("Student Name---"+name);
		System.out.println("Student Hobby---"+ hobby);
		System.out.println("Student Course---"+interestedCourse);
	}
	

}
