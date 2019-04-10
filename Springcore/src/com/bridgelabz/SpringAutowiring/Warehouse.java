package com.bridgelabz.SpringAutowiring;

public class Warehouse {
	String name;
	String city;
	long phno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Warehouse [name=" + name + ", city=" + city + ", phno=" + phno + "]";
	}
	

}
