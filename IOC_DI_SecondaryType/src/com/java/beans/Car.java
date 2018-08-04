package com.java.beans;

public class Car {

	private String cname;
	private Engine engine;
	
	public void setCname(String cname){
		this.cname=cname;
	}
	public void setEngine(Engine engine){
		this.engine=engine;
	}
	
	public void printData(){
		System.out.println("Car Name: "+cname);
		System.out.println("Model Year: "+engine.getModelYear());
	}
}
