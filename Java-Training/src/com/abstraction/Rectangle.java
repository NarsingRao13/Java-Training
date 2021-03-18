package com.abstraction;

public class Rectangle extends Shape{
	
	double length;
	double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ractangle Color is "+super.getColor()+" ,area is: "+area();
	}
}
