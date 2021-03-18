package com.aggregation;

public class Students {
	private int STD_ID;
	private String name;
	private char gender;
	private String address;
	private String course;
	
	
	public Students(int sTD_ID, String name, String course, char gender, String address) {
		STD_ID = sTD_ID;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.course = course;
	}

	public int getSTD_ID() {
		return STD_ID;
	}

	public void setSTD_ID(int sTD_ID) {
		STD_ID = sTD_ID;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @return the adderss
	 */
	public String getAdderss() {
		return address;
	}

	/**
	 * @param adderss the adderss to set
	 */
	public void setAdderss(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	
	
	
}
