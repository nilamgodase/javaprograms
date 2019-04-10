package com.bridgelabz.autowirAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Body {
	public static void main(String []args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/workspace-sts-3.9.8.RELEASE/Springcore/autowirAnotation1.xml");
	
		
		Human human=(Human)context.getBean("human");
		human.startPumping();
	}

}
