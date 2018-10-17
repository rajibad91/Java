package com.examples.spring.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SetterBased.xml");
		Employee emp=(Employee)context.getBean("empBean");
		System.out.println(emp.getEmpName()+" id: "+emp.getEmpId());
	}

}
