package com.bridgelabz.SpringConstructor;


public class Square {
	private String type;
	int height;
	
	public int getHeight() {
		return height;
	}

	

	public String getType() {
		return type;
	}

	//constuctor

	public Square(String type, int height) {
		this.type = type;
		this.height = height;
	}



	public void draw()
	{
		System.out.println(getType()+"---square draw----"+getHeight()+"---Height");
		
	}
	//constuctor
	public Square(String type) {
		
		this.type = type;
	}
	//constuctor
public Square(int height) {
		
		this.height=height;
	}
}
