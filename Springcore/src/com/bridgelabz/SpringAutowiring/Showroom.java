package com.bridgelabz.SpringAutowiring;





public class Showroom {
	String city;
	String name;
	private Car car;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Showroom [city=" + city + ", name=" + name + ", car=" + car + "]";
		
	}
	
	
}
