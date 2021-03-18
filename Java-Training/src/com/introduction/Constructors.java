package com.introduction;

public class Constructors {
	
	Constructors()
	{
		System.out.println("Default Constructor");
	}
	
	
	Constructors(int a,String s){
		System.out.println("Parametrized  Constructor");
	}
	
	
	public static void main(String[] args) {
		new Constructors();
		new Constructors(1,"Narsing");
	}

}
