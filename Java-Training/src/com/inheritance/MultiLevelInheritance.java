package com.inheritance;

class A{
	int a = 10;
}

class B extends A{
	int b = 15;
}

class C extends B{
	int c = 20;
	short r;
}

public class MultiLevelInheritance {

	public static void main(String[] agrs){
		C ob = new C();
		ob.r = (short) (ob.a + ob.b + ob.c);
		System.out.println("The result: "+ob.r);
	}

}
