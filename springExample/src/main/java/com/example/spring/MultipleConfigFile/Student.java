package com.example.spring.MultipleConfigFile;

public class Student {
	
	private String sId;
	private String sName;
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}

	private College college;
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
}
