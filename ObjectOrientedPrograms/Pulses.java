package com.Bridgelabz.ObjectOrientedPrograms;

import java.io.Serializable;

public class Pulses implements Serializable 
{
@Override
	public String toString() {
		return "Pulses [name=" + name + ", price=" + price + ", weight=" + weight + "]";
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
private String name;
private double price;
private int weight;

}
