package com.java.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.java.beans.Test;

public class Client {

	public static void main(String[]args) throws Exception{
		
		Resource res=null;
		BeanFactory fac=null;
		Object obj=null;
		
		
		res=new FileSystemResource("src/com/java/cfgs/spring.xml");
		System.out.println("file mapped");
		fac=new XmlBeanFactory(res);
		System.out.println("factory object");
		obj=fac.getBean("o");
		System.out.println("bean object");
		Test t=(Test)obj;
		System.out.println("object mapped");
		t.printData();
		System.out.println("print method ");
	}
}
