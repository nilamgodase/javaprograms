package com.bridgelabz.qualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDtls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contex=new ClassPathXmlApplicationContext("SpringValue.xml");
		System.out.println("xml file is loaded");
		Student student=(Student)contex.getBean("student");
		student.displayStudentInfo();
	}

}
