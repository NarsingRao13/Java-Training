package com.inheritance;


class Parent{
	String s1 = "Parent";
}

public class SingleInheritance extends Parent {

	String s2  = "Child";
	public static void main(String[] agr) {
		SingleInheritance ob = new SingleInheritance();
		System.out.println("I am "+ob.s2);
		System.out.println("I am "+ob.s1);
	}

}
