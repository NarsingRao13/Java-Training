package com.introduction;

public class Employee {
	private int id;
	private String name;
	private short age;
	private double sal;
	private char gender;
	private boolean maritalStatus;
	
	public Employee(){
		
	}

	public Employee(int id, String name, short age, double sal, char gender, boolean maritalStatus) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public short getAge() {
		return age;
	}



	public void setAge(short age) {
		this.age = age;
	}



	public double getSal() {
		return sal;
	}



	public void setSal(double sal) {
		this.sal = sal;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}



	public boolean isMaritalStatus() {
		return maritalStatus;
	}



	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}



	public static void main(String[] args) {
		Employee emp = new Employee(1560,"UMA", (short)22 , 1200002.3 ,'M',false);
		System.out.println( emp.getId());
		System.out.println( emp.getName());
		System.out.println( emp.getGender());
		System.out.println( emp.getAge());
		System.out.println( emp.getSal());
		System.out.println( emp.isMaritalStatus());
		

	}

}
