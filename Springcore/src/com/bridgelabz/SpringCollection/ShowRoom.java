package com.bridgelabz.SpringCollection;

import java.util.List;

public class ShowRoom {
	String city;
	String name;
	private List<Car> cars;
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
	

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	@Override
	public String toString() {
		return "ShowRoom [city=" + city + ", name=" + name + ", cars=" + cars + "]";
	}

//	public void show()
//	{
//		for(Car car:cars)
//		{
//			
//			System.out.println("car name="+car.getName()+"car colur="+car.getColour()+"car price="+car.getPrice());
//			System.out.println("City: "+getCity()+"Name: "+getName());
//		}
//	}

}
