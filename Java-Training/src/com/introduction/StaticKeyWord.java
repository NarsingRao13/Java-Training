package com.introduction;

public class StaticKeyWord {

	int c=10;
	static int cnt=10;
	static int add(int a,int b){
		return a+b;
	}
	
	public StaticKeyWord() {
		c++;
		cnt++;
		System.out.println("c: "+c+" cnt: "+cnt);
	}
	
	static{
		System.out.println("static block");
	}

	public static void main(String[] args) {
		 new StaticKeyWord();
		 new StaticKeyWord();
		 new StaticKeyWord();
		 System.out.println( StaticKeyWord.add(21, 54));
	}

}
