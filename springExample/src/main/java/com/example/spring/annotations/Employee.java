package com.example.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;
@PropertySource("classpath:college.properties")
@Component("emp")
public class Employee {

	@Value("${id}")
	private int id;
	@Value("${name}")
	private String name;
	@Autowired
	private Address add;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAdd() {
		return add;
	}
	
	  @Bean
	     public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	        return new PropertySourcesPlaceholderConfigurer();
	     }

}
