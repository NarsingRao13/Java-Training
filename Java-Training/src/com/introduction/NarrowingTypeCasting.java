package com.introduction;

public class NarrowingTypeCasting {
	
	public static void main(String[] args) {
		double d = 113.12321;
		float f = (float)d;
		long l = (long)f;
		int i = (int)l;
		short s = (short)i;
		byte b = (byte)s;
		System.out.println("double: "+d);
		System.out.println("float: "+f);
		System.out.println("long: "+l);
		System.out.println("int: "+i);
		System.out.println("short: "+s);
		System.out.println("byte: "+b);
	}

}
