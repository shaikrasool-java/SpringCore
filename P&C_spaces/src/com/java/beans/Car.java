package com.java.beans;

public class Car {
	private String carname;
	private Engine engine;
	
	//settters
	
	public void setCarname(String carname){
		this.carname=carname;
	}
	public void setEngine(Engine engine){
		this.engine=engine;
	}
	
	public void printData(){
		System.out.println("car name: "+carname);
		System.out.println("engine model year: "+engine);
	}

}
