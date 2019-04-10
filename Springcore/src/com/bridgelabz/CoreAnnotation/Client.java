package com.bridgelabz.CoreAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/workspace-sts-3.9.8.RELEASE/Springcore/springComponent.xml");
		College college=(College)context.getBean("collegebean");
		college.displayCollegeInfo();
		

	}

}
