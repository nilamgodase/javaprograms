package com.bridgelabz.SpringCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/workspace-sts-3.9.8.RELEASE/Springcore/springCar.xml");
		ShowRoom show=(ShowRoom)context.getBean("carwale");
		System.out.println(show);
	//	 show.show();
		 

	}

}
