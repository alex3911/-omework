package com.car.runner;

public class Car {
	
	public String model;
	
	public Car () {
		model = "Porsche";
	}
	
	public Car (String model) {
		
		this.model = model;
	}
	public String toString() {
		return "model:  "	+	model;
	}
	
	public void rides() {
		System.out.println ("Car rides");
	}
	public void filling () {
		System.out.println ("The car is refueled");
	}
	}
