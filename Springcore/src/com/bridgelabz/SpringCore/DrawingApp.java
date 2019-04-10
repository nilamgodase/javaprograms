package com.bridgelabz.SpringCore;





import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Triangle triangle=new Triangle();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/workspace-sts-3.9.8.RELEASE/Springcore/spring.xml");
	
		 Triangle triangle=(Triangle)context.getBean("triangle");
		 triangle.draw();

	}

}
