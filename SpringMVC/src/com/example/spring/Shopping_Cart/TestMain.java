package com.example.spring.Shopping_Cart;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringJDBC.xml");
		//((AnnotationConfigApplicationContext) context).scan("com.example.spring.Shopping_Cart");
		//((AbstractApplicationContext) context).refresh();
		ServiceClass service = (ServiceClass) context.getBean("service");
		Map<String,String> map=new HashMap<String, String>();
		System.out.println("after map object");
		map.put("1", "Men");
		map.put("2", "Women");
		map.put("3", "Children");
		System.out.println(map);
		service.getCategory().setCategoryName(map);
		System.out.println(service.getCategory().getCategoryName());
		
		
		
	}

}
