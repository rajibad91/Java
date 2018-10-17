package com.example.spring.scopeOfBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope.xml");
		System.out.println(context);

		BeanScope bs = (BeanScope) context.getBean("scopeBean");
		System.out.println(bs);
		BeanScope bs1 = (BeanScope) context.getBean("scopeBean");
		System.out.println(bs1);

		// ApplicationContext context1=new
		// ClassPathXmlApplicationContext("BeanScope.xml");
		// System.out.println(context1);
	}

}
