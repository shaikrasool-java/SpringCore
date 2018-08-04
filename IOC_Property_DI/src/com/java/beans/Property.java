package com.java.beans;

import java.util.Properties;
import java.util.Set;

public class Property {

	private Properties driver;
	//setter methods
	public void setDriver(Properties driver){
		this.driver=driver;
	}
	
	public void printData(){
		 Set keys=driver.keySet();
		 for(Object key:keys){
			 System.out.println(key+": "+driver.getProperty(key.toString()));
		 }
	}
}
