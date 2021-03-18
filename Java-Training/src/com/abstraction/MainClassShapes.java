package com.abstraction;

public class MainClassShapes {
	
	public static void main(String[] ars){
		Shape s1 = new Circle("Red",2);
		Shape s2 = new Rectangle("Blue",21,4);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
