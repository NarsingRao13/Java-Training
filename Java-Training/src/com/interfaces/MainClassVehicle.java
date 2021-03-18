package com.interfaces;

public class MainClassVehicle {

	public static void main(String[] args) {
		Honda h = new Honda("car","Yellow");
		Pulsar p = new Pulsar("Bike","Black");
		System.out.println(h.vehicleInfo());
		System.out.println(p.vehicleInfo());
	}

}
