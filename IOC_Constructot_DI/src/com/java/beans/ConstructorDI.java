package com.java.beans;

public class ConstructorDI {

	private String type;
	private int height;
	public ConstructorDI(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}
	public String getType(){
		return type;
	}
	public int getHeight(){
		return height;
	}
	public void draw(){
		System.out.println("given the object type...: ");
		System.out.println("Type: "+type);
		System.out.println("Height: "+height);
	}
	
	
	
}
