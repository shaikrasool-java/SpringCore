package com.java.beans;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;

public class Test {

	private String driver;
	private String url;
	private String user;
	private String password;
	
	//setters
	@Required
	public void setDriver(String driver){
		this.driver=driver;
	}
	@Required
	public void setUrl(String url){
		this.url=url;
	}
	
	@Required
	public void setUser(String user){
		this.user=user;
	}
	@Required
	public void setPassword(String password){
		this.password=password;
	}
	
	
	public void printData()throws Exception{
		System.out.println("from print method");
		Class.forName("Driver: "+driver);
		System.out.println("driver");
		Connection con=DriverManager.getConnection("url","user","password");
		System.out.println("connection obj");
		System.out.println(con);
	}
}

