package com.java.beans;

public class Bus {

	private Engine engine;

	public Bus(Engine engine) {
	
		this.engine = engine;
	}
	public void printData(){
		System.out.println("Bus engine model year: "+engine.getModelYear());
	}
	
}
