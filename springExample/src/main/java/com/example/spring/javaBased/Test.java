package com.example.spring.javaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		Employee employee = (Employee) context.getBean("emp");
		employee.service();

	}

}
