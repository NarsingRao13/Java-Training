package com.interfaces;

interface E{
	void draw();  
	static int cube(int x){return x*x*x;}  
	int i =10;
}

class F implements E{

	@Override
	public void draw() {
		System.out.println("i value in interface A is: "+i);
	}
	
}
public class StaticMethod_in_Interface {

	public static void main(String[] args) {
		E ob = new F();
		ob.draw();
		System.out.print(E.cube(3));
	}

}
