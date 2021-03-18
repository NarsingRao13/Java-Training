package com.introduction;

public class Operators1 {
	static boolean boo;
	static byte by;
	static char c;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static String st;
	Operators1()
	{
		boo = false;
		by =10;
		c = 'A';
		s = 12;
		i =12433;
		l =1331312413;
		f = 13.23423f;
		d = 1.131;
		st = "Narsing";
	}
	
	
	/*public void display(){
		System.out.println("boolean value: "+boo);
		System.out.println("byte value: "+by);
		System.out.println("char value: "+c);
		System.out.println("short value: "+s);
		System.out.println("int value: "+i);
		System.out.println("long value: "+l);
		System.out.println("float value: "+f);
		System.out.println("double value: "+d);
		System.out.println("String value: "+st);
	}
	*/
	
	public static void unaryOperation(){
		int j=10;
		int k=12;
		System.out.println("j++: "+j++);
		System.out.println("j: "+j);
		System.out.println("j--: "+j--);
		System.out.println("j: "+j);
		
		System.out.println("++k: "+(++k));
		System.out.println("k: "+k);
		System.out.println("--k: "+(--k));
		System.out.println("k: "+k);
		
		System.out.println("~i: "+~i);
		System.out.println("!boo: "+!boo);
		
	}
	
	public static void arithmeticOperation(){
		int a=10;
		int b=5;
		System.out.println("a+b: "+a+b);
		System.out.println("a-b: "+(a-b));
		System.out.println("a*b: "+a*b);
		System.out.println("a/b: "+a/b);
		System.out.println("a%b: "+a%b);
	}

	public static void shiftOperation(){
		//int a =0;
		System.out.println("i>>2: "+(i>>2));
		System.out.println("i<<2: "+(i<<2));
	}

	public static void relationalOperation(){
		if(i==10)
			System.out.println(i);
		else	
			System.out.println(10);
	}

	public static void bitwaseOperation(){
		int p=2;
		System.out.println(i&p);
		System.out.println(i^p);
		System.out.println(i|p);
	}

	public static void logicalOperation(){
		int q =20;
		System.out.println(i==10 && q== 10);
		System.out.println(i==10 || q==10 );
	}

	public static void ternaryOperation(){
		System.out.println(i>20?10:20);
	}

	public static void assignmentOperation(){
		int a=20;
		int c=10;
		c+=a;
		System.out.println("c+=a: "+c);
		c-=a;
		System.out.println("c-=a: "+c);
		c*=a;
		System.out.println("c*=a: "+c);
		c/=a;
		System.out.println("c/=a: "+c);
		c%=a;
		System.out.println("c%=a: "+c);
	}


	public static void main(String[] args) {
		unaryOperation();
		arithmeticOperation();
		shiftOperation();
		relationalOperation();
		bitwaseOperation();
		logicalOperation();
		ternaryOperation();
		assignmentOperation();
	}

}
