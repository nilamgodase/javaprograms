package com.bridgelabz.SpringAutowiring;

public class Scooty {
	String name;
	String colour;
	long price;
	private Warehouse warehouse;
	
	public Scooty( Warehouse warehouse) {
		
		
		this.warehouse = warehouse;
	}
	
	
	@Override
	public String toString() {
		return "Scooty [name=" + name + ", colour=" + colour + ", price=" + price + ", warehouse=" + warehouse + "]";
	}


	public String getName() {
		return name;
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
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	

}
