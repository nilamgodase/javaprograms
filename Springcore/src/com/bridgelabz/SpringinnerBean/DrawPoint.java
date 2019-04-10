package com.bridgelabz.SpringinnerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.bridgelabz.SpringCore.Triangle;
import com.bridgelabz.SpringinnerBean.Triangle;

public class DrawPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/workspace-sts-3.9.8.RELEASE/Springcore/innerBean.xml");
		
		 Triangle triangle=(Triangle)context.getBean("triangle");
		 triangle.draw();

	}

}
