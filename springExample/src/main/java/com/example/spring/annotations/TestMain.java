package com.example.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ApplicationContext context=new
		// ClassPathXmlApplicationContext("Annotations.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.example.spring.annotations");
		context.refresh();
		Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAdd().getCity());

	}

}
