package com.bridgelabz.autowirAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeDtls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/workspace-sts-3.9.8.RELEASE/Springcore/autowirAnotation.xml");
		
		
		College college=(College)context.getBean("college");
		 System.out.println(college);

	}

}
