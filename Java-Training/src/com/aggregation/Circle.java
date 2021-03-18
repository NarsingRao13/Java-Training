package com.aggregation;

public class Circle {
	Operation op;//aggregation
	
	final double PI = 3.14;
	double area(int radius){
		op = new Operation();
		int res = op.square(radius);
		return PI*res;
	}
}
