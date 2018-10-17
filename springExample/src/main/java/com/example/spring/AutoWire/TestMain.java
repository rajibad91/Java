package com.example.spring.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("AutoWire.xml");

BeanAutoWire bean1=(BeanAutoWire)context.getBean("bean1");
System.out.println(bean1.getBeanByName().getName());
System.out.println(bean1.getBeanByType().getType());
//System.out.println(bean1.getBeanByConstructor().getConstruct());

BeanAutoWire bean2=(BeanAutoWire)context.getBean("bean2");
System.out.println(bean2.getBeanByType().getType());
System.out.println(bean2.getBeanByName().getName());

BeanAutoWire bean3=(BeanAutoWire)context.getBean("bean3");
System.out.println(bean3.getBeanByConstructor().getConstruct());
		
	}

}
