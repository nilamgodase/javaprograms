package com.bridgelabz.SpringAutowiring;

public class Bike {
	String bname;
	String bcolour;
	double price;
	private Warehouse warehouse;
	@Override
	public String toString() {
		return "Bike [bname=" + bname + ", bcolour=" + bcolour + ", price=" + price + ", warehouse=" + warehouse + "]";
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBcolour() {
		return bcolour;
	}
	public void setBcolour(String bcolour) {
		this.bcolour = bcolour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
