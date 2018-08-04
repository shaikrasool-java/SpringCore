package com.java.tests;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Protytype {

	public static void main(String[]args){
		
		Resource r=new ClassPathResource("resources/prototype.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		Object o1=factory.getBean("t");
		Object o2=factory.getBean("t");
		Object o3=factory.getBean("t");
		Object o4=factory.getBean("t");
System.out.println(o1==o2);
System.out.println(o3==o4);

	
	}
}
