package com.java.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.java.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
		BeanFactory factory=null;
		Resource res=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		
		//locate spring bean config file
		res=new FileSystemResource("src/com/java/cfgs/applicationContext.xml");
		//create ioc container
		factory=new XmlBeanFactory(res);
		obj=factory.getBean("wish");
		//type casting...
		 generator=(WishMessageGenerator)obj;
		 System.out.println("Message:>"+generator.generateWishMsg(": rasool"));
	}
}
