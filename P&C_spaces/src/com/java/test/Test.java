package com.java.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.java.beans.Car;

public class Test {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory fac=null;
		Object obj=null;
		
		res=new FileSystemResource("src/com/java/cfgs/spring.xml");
		fac=new XmlBeanFactory(res);
		obj=fac.getBean("c");
		Car c=(Car)obj;
		c.printData();
	}
}
