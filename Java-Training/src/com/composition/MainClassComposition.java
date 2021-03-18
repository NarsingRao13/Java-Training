package com.composition;

import java.util.*;

public class MainClassComposition {
	public static void main(String[] args){
		College c1 = new College("MallaReddy Engineering College","Hyderabad");
		College c2 = new College("Vasavi College","Hyderabad");
		College c3 = new College("Delhi University","New Delhi");
		List<College> college = new ArrayList<College>();
		
		college.add(c1);
		college.add(c2);
		college.add(c3);
		
		University u = new University(college);
		
		List<College> colleges = u.getTotalCollegesInUniversity();
		for (College college2 : colleges) {
			 System.out.println("Name : " + college2.name   
                     + " and "  
                     + " Address : " + college2.address);   
		}
	}
}
