package com.methodoverriding;

public class MainClassOverriding {
	public static void main(String[] args)
	{
		Class1 ob0 = new Class1();
		ob0.method1();
		ob0.method2();
		System.out.println();
		
		Class2 ob1= new Class2();
		ob1.method1();
		ob1.method2();
		System.out.println();
		
		Class1 ob2 = new Class2(); //upcasting
		ob2.method1();
		ob2.method2();
		
	}
}
