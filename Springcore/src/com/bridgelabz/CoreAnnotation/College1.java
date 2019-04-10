package com.bridgelabz.CoreAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean1")
public class College1 {
	String name;
	String city;
	
	@Value("tasis")
	public void setName(String name) {
		this.name = name;
	}
	@Value("delhi")
	public void setCity(String city) {
		this.city = city;
	}
	public void displayCollegeInfo()
	{
		System.out.println("College Name---"+name);
		System.out.println("College City---"+city);
		
	}
}
