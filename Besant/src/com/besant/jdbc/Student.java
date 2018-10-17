package com.besant.jdbc;

public class Student {
	private String studentId;
	private String studentName;
	private String studentAdd;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAdd() {
		return studentAdd;
	}
	public void setStudentAdd(String studentAdd) {
		this.studentAdd = studentAdd;
	}

	public String toString()
	{
		return this.studentId+" :: "+this.studentName+" :: "+this.studentAdd;
	}
}
