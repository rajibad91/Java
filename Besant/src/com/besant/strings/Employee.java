package com.besant.strings;

import java.util.Date;

public final class Employee {
	
	private final int empId=10;
	private final String empName="RLD";
	@SuppressWarnings("unused")
	private  Date date;
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Date getDate() {
		return new Date();
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
