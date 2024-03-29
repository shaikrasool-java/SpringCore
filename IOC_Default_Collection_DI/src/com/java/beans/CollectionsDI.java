package com.java.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDI {

	private List fruits;
	private Set Cricketers;
	private Map cc;//countries and capitals
	
	
	
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(Set cricketers) {
		Cricketers = cricketers;
	}
	public void setCc(Map cc) {
		this.cc = cc;
	}
	
	
	public void printData(){
		System.out.println("Fruits....");
		for(Object f:fruits){
			System.out.println("fruit: "+f);
		}
		System.out.println("Cricketers....");
		for(Object c:Cricketers){
			System.out.println("cricketer: "+c);
		}
		
		System.out.println("Countries and capitals...");
		
		Set keys=cc.keySet();
		for(Object key:keys){
			System.out.println("Country: "+key+", capital: "+cc.get(key));
		}
	}
}
