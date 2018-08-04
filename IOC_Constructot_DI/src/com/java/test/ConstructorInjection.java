package com.java.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.java.beans.ConstructorDI;

public class ConstructorInjection {

	public static void main(String[] args) {
		
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		
		res=new FileSystemResource("src/com/java/cfgs/spring.xml");
		factory=new XmlBeanFactory(res);
		obj=factory.getBean("CDI");
		ConstructorDI cdi=(ConstructorDI)obj;
		cdi.draw();
	}
}
