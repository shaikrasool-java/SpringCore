package com.java.tests;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

public static void main(String[]args){
	
	Resource r=new ClassPathResource("resources/spring.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	System.out.println("valid document....");
	
	factory.getBean("t");
	factory.getBean("t");
	factory.getBean("t");
}

}
