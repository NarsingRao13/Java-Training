package com.introduction;

class C{
	C(int a){
		System.out.println("C class int a: "+a);
	}
}

public class D extends C {

	D(int a) {
		super(a);
		System.out.println("D class int a: "+a);
	}
	
	

}
