package com.example.spring.annotationswithXML;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	private String city;
	private String state;
	public String getCity() {
		return city;
	}
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
