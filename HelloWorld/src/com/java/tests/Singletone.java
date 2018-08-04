package com.java.tests;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.java.beans.Test;

public class Singletone {

	
	public static void main(String[]args){
		
		System.out.println("main method...");
	
		Resource r=new ClassPathResource("resources/singleton.xml");
	
		BeanFactory factory=new XmlBeanFactory(r);
		System.out.println("document is valid...");
		
		Object o1=factory.getBean("t");
		Object o2=factory.getBean("t");
		Object o3=factory.getBean("t");
		Object o4=factory.getBean("t");
		System.out.println(o1==o2);
		System.out.println(o3==o4);
		
		/*Object o=factory.getBean("t");
		Test t=(Test)o;
		t.hello();
		t.hello();
		t.hello();*/
		
	}
}
