package com.bridgeit.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) 
	{   
		//framework is creating object
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		//with coasting
//		Airtel air=(Airtel) context.getBean("Airtel");
//        air.calling();
//        air.data();
		
		//without casting
//		Airtel air=context.getBean("Airtel",Airtel.class);
//		air.calling();
//        air.data();
		
        //without touching source code how to do
		sim sim=context.getBean("sim",sim.class);
		sim.calling();
		sim.data();
		
	}
}
