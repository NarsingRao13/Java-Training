package com.methodoverriding;

public class Class2 extends Class1{
	String s = "Heyy";
	public void method1(){
		System.out.println("Class2 - method1: non-static");
	}
	
	public static void method2(){
		System.out.println("Class2 - method2: static");
	}
}
