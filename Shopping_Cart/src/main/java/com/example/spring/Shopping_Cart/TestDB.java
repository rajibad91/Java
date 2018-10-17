package com.example.spring.Shopping_Cart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Service.xml");
		Service service = (Service) context.getBean("beanService");

	}

}
