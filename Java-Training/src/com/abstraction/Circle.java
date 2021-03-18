package com.abstraction;

public class Circle extends Shape {
	double radius;
	
	public Circle(String color,double radius) {
		super(color);
		this.radius =  radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		//i= 15;
		System.out.println(i);
		return "Circle Color is "+super.getColor()+" ,area is: "+area();
	}
}
