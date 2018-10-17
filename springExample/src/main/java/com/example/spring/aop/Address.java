package com.example.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class Address {
	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	@Value("Bangalore")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Value("KA")
	public void setState(String state) {
		this.state = state;
	}

}
