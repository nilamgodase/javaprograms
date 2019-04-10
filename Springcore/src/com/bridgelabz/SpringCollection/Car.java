package com.bridgelabz.SpringCollection;

public class Car {
	String name;
	String colour;
	double price;
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
