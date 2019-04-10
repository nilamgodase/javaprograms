package com.bridgelabz.CoreAnnotation;

public class Student {
	private String name;
	private String hobby;
	private String interestedCourse;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
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
