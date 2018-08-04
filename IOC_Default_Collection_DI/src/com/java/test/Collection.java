package com.java.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.java.beans.CollectionsDI;

public class Collection {

	public static void main(String[] args) {
		
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;

		res=new FileSystemResource("src/com/java/cfgs/collection.xml");
		factory=new XmlBeanFactory(res);
		obj=factory.getBean("c");
		CollectionsDI cd=(CollectionsDI)obj;
		cd.printData();
		
	}
}
