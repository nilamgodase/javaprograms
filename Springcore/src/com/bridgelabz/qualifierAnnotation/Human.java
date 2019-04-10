package com.bridgelabz.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bridgelabz.qualifierAnnotation.Heart;

public class Human {
	
	private Heart heart;
	@Autowired
	@Qualifier("dogheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called");
	}
	
	
	public void startPumping()
	{	if(heart!=null) {
		heart.pump();
		System.out.println("name::"+heart.getNameOfAnimal()+"  number of hearts::  "+heart.getNoOfHeart());
		
	}else
	{
		System.out.println("you are dead");
	}

}
}
