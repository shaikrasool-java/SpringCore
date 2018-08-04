package com.java.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.java.beans.Property;

public class Test {

	public static void main(String[] args) {

		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		
		res=new FileSystemResource("src/com/java/cfgs/spring.xml");
		factory=new XmlBeanFactory(res);
		obj=factory.getBean("p");
		Property p=(Property)obj;
		p.printData();
		
	}
}
