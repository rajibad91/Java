package com.example.hibernate.compositeKey;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Registration implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5349458738272852235L;
	private int addressId;
	private String address1;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
}
