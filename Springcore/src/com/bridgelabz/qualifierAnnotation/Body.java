package com.bridgelabz.qualifierAnnotation;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.bridgelabz.autowirAnnotation.Human;

public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/workspace-sts-3.9.8.RELEASE/Springcore/src/com/bridgelabz/qualifierAnnotation/qualifierAnnotation.xml");
	
		
		Human human=(Human)context.getBean("human");
		human.startPumping();

	}

}
