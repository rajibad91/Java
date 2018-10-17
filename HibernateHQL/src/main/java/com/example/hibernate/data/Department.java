package com.example.hibernate.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name="RLD.dbo.Dept")
@NamedQuery(name="Department_getDepartment", query="From Department")
public class Department implements Serializable {
	/**
	 * 
	 */
	//static final String getDepartment=
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="deptid")
	private int deptId;
	@Column(name="deptname")
	private String deptName;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
