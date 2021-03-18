package com.inheritance;

class Parent1{
	void method(){
		System.out.println("Parent1");
	}
}

class Parent2{
	void method(){
		System.out.println("Parent2");
	}
}

public class MultileInheritance extends Parent1  {

	public static void main(String[] agrs){
		MultileInheritance ob = new MultileInheritance();
		ob.method();
	}

}
