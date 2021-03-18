package com.introduction;

public class Variables1 {
	int a=100;			//non static
	static int b = 500;	//static
	long p = 61246;
	public static void main(String[] agrs){
		int c = 1000;	//local
		Variables1 ob = new Variables1();
		System.out.println("Non static/instance variable: "+ob.a);
		System.out.println("Static variable: "+b);
		System.out.println("Local variable: "+c);
		System.out.println(ob.a+b+c);
		System.out.println(1+1.2f+13.324);
	}
	
}
