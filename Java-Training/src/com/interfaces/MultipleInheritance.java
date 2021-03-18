package com.interfaces;

public class MultipleInheritance implements College, Company, Employee{

	private String college;
	private String company;
	
	
	public MultipleInheritance(String college, String company) {
		super();
		this.college = college;
		this.company = company;
	}

	@Override
	public String getCompanyName() {
		return this.company;
	}

	@Override
	public String getCollegeName() {
		return this.college;
	}
	
	@Override
	public String getEmployeeInfo() {
		return "I am graduated from "+getCollegeName()+" and currently working in "+getCompanyName();
	}
	
	public static void main(String[] args) {
		MultipleInheritance ob = new MultipleInheritance("MallaReddy Engineering College","Techouts");
		System.out.println(ob.getEmployeeInfo());
	}


	
	

}
