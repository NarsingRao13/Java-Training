package com.methodoverriding;

public class Class1 {
	public void method1(){
		System.out.println("Class1 - method1: non-static");
	}
	
	public static void method2(){
		System.out.println("Class1 - method2: static");
	}
}
