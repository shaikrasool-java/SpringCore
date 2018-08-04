package com.java.beans;

public class Car {

	private String[] carnames;
	private Engine[] engine;
	
	public void setCarnames(String[] carnames){
		this.carnames=carnames;
	}
	public void setEngine(Engine[]engine){
		this.engine=engine;
	}
	
	public void printData(){
		for(String car:carnames){
			System.out.println("Car Name: "+car);
		}
		for(Engine e:engine){
			System.out.println("ModelYear: "+e.getModelYear());
		}
	}
}
