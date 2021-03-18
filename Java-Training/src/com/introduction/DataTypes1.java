package com.introduction;

public class DataTypes1 {
	boolean boo;
	byte by;
	char c;
	short s;
	int i;
	long l;
	float f;
	double d;
	String st;
	DataTypes1()
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
	public void display(){
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
	public static void main(String[] agrs){
		DataTypes1 ob = new DataTypes1();
		ob.display();
	}
}
