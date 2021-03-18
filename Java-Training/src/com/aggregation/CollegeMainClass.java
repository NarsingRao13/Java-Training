package com.aggregation;

import java.util.*;

public class CollegeMainClass {

	

	public static void main(String[] args) {
		ModelClass m1 = new ModelClass();
		Students s1 = new Students(1560,"Narsing","IT",'M',"Hyderabad");
		Students s2 = new Students(1561,"Uma Mahesh","CSE",'M',"Hyderabad");
		Students s3 = new Students(1562,"Vijaya","CSE",'F',"Hyderabad");
		m1.setsList(s1);
		m1.setsList(s2);
		m1.setsList(s3);
		
		List<Students> sList1 = new ArrayList<Students>();
		List<Students> sList2 = new ArrayList<Students>();
		
		sList1.add(s1);
		sList2.add(s2);
		sList2.add(s3);
		
		List<Courses> it = new ArrayList<Courses>();
		List<Courses> cse = new ArrayList<Courses>();
		m1.setcList(new Courses(01,"IT",sList1));
		m1.setcList(new Courses(02,"CSE",sList2));
		
		Courses c1 = new Courses();
		c1.setData(it);
		c1.setData(cse);
		
		College c = new College();
		c.display();
	}

}
