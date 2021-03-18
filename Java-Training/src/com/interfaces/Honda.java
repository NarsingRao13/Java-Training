package com.interfaces;

public class Honda implements Car {

	String vehicle;
	String color;
	
	

	public Honda(String vehicle, String color) {
		super();
		this.vehicle = vehicle;
		this.color = color;
	}

	@Override
	public String vehicleType() {
		return this.vehicle;
		
	}

	@Override
	public String carColor() {
		return this.color;
		
	}

	public String vehicleInfo(){
		return "Honda is "+vehicleType()+" \n - it has "+noOfWheels+" wheels and it is of "+carColor()+" color";
	}
}
