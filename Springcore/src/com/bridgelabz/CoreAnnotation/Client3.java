package com.bridgelabz.CoreAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig1.class);
		College2 college2=(College2)context.getBean("collegeBean2");
		college2.test();

	}

}
