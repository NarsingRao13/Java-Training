package com.aggregation;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Courses {
	private int COURSE_ID;
	private String courseName;
	private static List<Students> students;
	private List<Courses> data = new ArrayList<Courses>();
	
	
	
	
	public Courses() {
		
	}



	public Courses(int cOURSE_ID, String courseName, List<Students> students) {
		COURSE_ID = cOURSE_ID;
		this.courseName = courseName;
		this.students = students;
	}
	
	

	public List<Courses> getData() {
		return data;
	}



	public void setData(List<Courses> data) {
		this.data = (data);
	}



	public int getCOURSE_ID() {
		return COURSE_ID;
	}
	
	public void setCOURSE_ID(int cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public List<Students> getStudents() {
		return students;
	}
	
	public void setStudents(List<Students> students) {
		this.students = students;
	}
	
	
}
