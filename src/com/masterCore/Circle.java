package com.masterCore;

public class Circle extends Shape {
	private double radius;
	public Circle() {}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		return 3.14*radius*radius;
	}
	
}
