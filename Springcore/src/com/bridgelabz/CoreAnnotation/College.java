package com.bridgelabz.CoreAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegebean")
public class College {
	String name;
	String city;
	@Value("Techno India")
	public void setName(String name) {
		this.name = name;
	}
	@Value("kolkata")
	public void setCity(String city) {
		this.city = city;
	}
	public void displayCollegeInfo()
	{
		System.out.println("College Name---"+name);
		System.out.println("College City---"+city);
		
	}

}
