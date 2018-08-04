package com.java.tests;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

public static void main(String[]args){
	System.out.println("main method");
	Resource r=new ClassPathResource("resources/spring.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	System.out.println("valid document....");
	factory.getBean("t");
	factory.getBean("t");
	
	
	}

}
