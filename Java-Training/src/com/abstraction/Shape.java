package com.abstraction;

public abstract class Shape {
	String color;
	int j = 10;
	static final int i = 10;
	abstract double area();
	public abstract String toString();
	
	public Shape(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
}
