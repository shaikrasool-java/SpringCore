package com.java.beans;

public class Bus {

	private Engine engine;

	public Bus() {
	System.out.println("defauld cons...");
	}

	public Bus(Engine engine) {
		this.engine = engine;
	System.out.println("cons-args");
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
		System.out.println("setter-method");
	}

	public void printData(){
		System.out.println("bus model year: "+engine.getModelYear());
	}
}
