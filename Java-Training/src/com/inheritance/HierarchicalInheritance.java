package com.inheritance;

class Car{
	 String s1 = "I have 4 wheels";
	 String s2 = "I have 2 head lights";
}

class Ford extends Car{
	String color = "Blue";
	public void details(){
		System.out.println("I am brand new Ford");
		System.out.println(new Ford().s1);
		System.out.println(new Ford().s2);
		System.out.println("I am "+new Ford().color);
	}
}

class Honda extends Car{
	String color = "Red";
	public void details(){
		System.out.println("I am brand new Honda");
		System.out.println(new Honda().s1);
		System.out.println(new Honda().s2);
		System.out.println("I am "+new Honda().color);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		new Ford().details();
		System.out.println();
		new Honda().details();
	}

}
