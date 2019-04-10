package com.bridgelabz.SpringAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WarehouseDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/workspace-sts-3.9.8.RELEASE/Springcore/src/com/bridgelabz/SpringAutowiring/springAutowirWarehouse.xml");
		
		
        Bike bike=(Bike)context.getBean("bike");
		System.out.println(bike);
		Cycle cycle=(Cycle)context.getBean("cycle");
		System.out.println(cycle);
		
		Scooty scooty=(Scooty)context.getBean("scooty");
		System.out.println(scooty);

	}

}
