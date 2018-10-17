package com.example.hibernate.compositeKey;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="[RLD].[dbo].ADDRESS")
public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2393703230669810188L;
	@EmbeddedId
	
	private Registration reg;
	
	private String city;
	private String state;
	private String zip;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Registration getReg() {
		return reg;
	}
	public void setReg(Registration reg) {
		this.reg = reg;
	}

}
