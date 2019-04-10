package com.bridgelabz.SpringCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import  com.bridgelabz.SpringCollection.Triangle;

public class Drawpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/workspace-sts-3.9.8.RELEASE/Springcore/spring3.xml");
		
		 Triangle triangle=(Triangle)context.getBean("triangle");
		 triangle.draw();

	}

}
