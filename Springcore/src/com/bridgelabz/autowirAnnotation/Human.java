package com.bridgelabz.autowirAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called");
	}
//	@Autowired
//	public Human(Heart heart) {
//		
//		this.heart = heart;
//		System.out.println("Human constructor is getting called");
//	}
	
	public void startPumping()
	{	if(heart!=null) {
		heart.pump();
		
	}else
	{
		System.out.println("you are dead");
	}

}
}