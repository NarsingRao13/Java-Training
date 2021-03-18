package com.interfaces;

interface C{  
	  void m1();  
	  interface D{  
	   void m2();  
	  }  
	}  

public class NestedInterfaces implements C,C.D{

	public static void main(String[] args) {
		
		
		C ob1 = new NestedInterfaces();
		ob1.m1();
		
		C.D ob2 = new NestedInterfaces();//reference to nested interface
		ob2.m2();

	}

	@Override
	public void m2() {
		System.out.println("M1");
		
	}

	@Override
	public void m1() {
		System.out.println("M2");
		
	}

}
