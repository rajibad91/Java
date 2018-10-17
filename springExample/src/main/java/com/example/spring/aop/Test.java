package com.example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.example.spring.aop");
		context.refresh();
		Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee.getEmpName());

	}

}
