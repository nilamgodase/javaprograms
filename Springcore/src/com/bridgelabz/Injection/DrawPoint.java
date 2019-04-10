package com.bridgelabz.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DrawPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/workspace-sts-3.9.8.RELEASE/Springcore/spring2.xml");
		
		 Triangle triangle=(Triangle)context.getBean("triangle");
		 triangle.draw();


	}

}
