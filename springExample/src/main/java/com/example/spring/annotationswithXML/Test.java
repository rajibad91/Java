package com.example.spring.annotationswithXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Annotations.xml");
		Employee emp=(Employee)context.getBean("emp");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getAddress().getCity());
		System.out.println(emp.getAddress().getState());
		

	}

}
