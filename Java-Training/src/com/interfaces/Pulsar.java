package com.interfaces;

public class Pulsar implements Bike {
	
	String vehicle;
	String color;
	
	

	public Pulsar(String vehicle, String color) {
		super();
		this.vehicle = vehicle;
		this.color = color;
	}

	@Override
	public String vehicleType() {
		return this.vehicle;
	}

	@Override
	public String vehicleInfo() {
		return "Pulsar is "+vehicleType()+" \n - it has "+noOfWheels+" wheels and it is of "+bikeColor()+" color";
	}

	@Override
	public String bikeColor() {
		return this.color;
	}

}
