package com.bridgelabz.SpringAutowiring;

public class Cycle {
	String cname;
	String colour;
	double price;
	private Warehouse warehouse;
	
	@Override
	public String toString() {
		return "Cycle [cname=" + cname + ", colour=" + colour + ", price=" + price + ", warehouse=" + warehouse + "]";
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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
