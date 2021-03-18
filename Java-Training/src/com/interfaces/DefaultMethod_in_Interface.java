package com.interfaces;

interface A{
	default void m1(){
		System.out.println("Method body in interface");
	}
}

class B implements A{
	public void m2(){System.out.println("normal method");}  
}
public class DefaultMethod_in_Interface {

	public static void main(String[] args) {
		A ob = new B();
		ob.m1();
		
	}

}
