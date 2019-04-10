package com.bridgelabz.AnnotationValue;

import org.springframework.beans.factory.annotation.Value;

public class Teacher {
	String name;
	String domain;
	
	@Value("Nilam")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("Java")
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public void displayTeacherInfo()
	{
		System.out.println("Teacher Name---"+name);
		System.out.println("Teacher Hobby---"+ domain);
		
	}
	
	

}
