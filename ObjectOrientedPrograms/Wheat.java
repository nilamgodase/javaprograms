package com.Bridgelabz.ObjectOrientedPrograms;

import java.io.Serializable;

public class Wheat implements Serializable  
{
	private String name;
	private double price;
	private int weight;
	@Override
	public String toString() {
		return "Wheat [name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
