package com.java.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;


	public void setDate(Date date) {
		this.date = date;
	}


	// business method
	

	public String generateWishMsg(String name){
		
		int hour=0;
		//get current hour
		 hour=date.getHours();
		 
		 if(hour<=12)
			 return ("GOODMORNING")+name;
		 else if(hour<=16)
			 return("GOOD AFTERNOON")+name;
		 else if(hour<=20)
			 return ("GOOD EVENING")+name;
		 else
			 return("GOOD NIGHT")+name;
	}
	
	

}
