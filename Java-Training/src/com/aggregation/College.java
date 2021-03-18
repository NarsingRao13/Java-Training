package com.aggregation;
import java.util.*;

public class College {
	
	final String collegeName   = "MallaReddy Engineering College";
	final int COLLEGE_CODE = 133;
	private Courses courses;

	
	public College(Courses courses) {
		super();
		this.courses = courses;
	}
	public College() {
		// TODO Auto-generated constructor stub
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public int getCOLLEGE_CODE() {
		return COLLEGE_CODE;
	}
	
	
	public void display(){
		ModelClass m2 = new ModelClass();
		List<Courses> cList = m2.getcList();
		List<Students> sList = m2.getsList();
		for(int i=0;i<cList.size();i++)
		{
			System.out.println();
			System.out.print("Courses id: "+cList.get(i).getCOURSE_ID());
			System.out.println("\tCourses Name: "+cList.get(i).getCourseName());
			System.out.println("Students of "+cList.get(i).getCourseName());
			
			for(int j=0;j<sList.size();j++)
			{
				
				System.out.println("Student "+j+1);
				System.out.println(sList.get(i).getName());
				System.out.println(sList.get(i).getSTD_ID());
				System.out.println(sList.get(i).getGender());
				System.out.println(sList.get(i).getAdderss());
			}
		}
	}
	
}
