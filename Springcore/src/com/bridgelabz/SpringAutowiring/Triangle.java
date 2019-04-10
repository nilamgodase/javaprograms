package com.bridgelabz.SpringAutowiring;



import com.bridgelabz.SpringAutowiring.Point;

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	

	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void draw()
	{
		System.out.println("point A=("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("point B=("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("point A=("+getPointC().getX()+","+getPointC().getY()+")");
	}

}
