package com.java.beans;

public class Car {

	private String carname;
	private Engine engine;
	//setter method
	public void setCarname(String carname){
		this.carname=carname;
	}
	public void setEngine(Engine engine){
		this.engine=engine;
	}
	public void printData(){
		System.out.println("Car Name: "+carname);
		System.out.println("Engine: "+engine.getModelYear());
	}
	
}
