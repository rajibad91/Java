package com.example.spring.jdbc;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationBean {
	
JdbcTemplate jt;
	
	public DBOperationBean(JdbcTemplate template) {
		this.jt=template;
	}
	
	public int countStudents() {
		//int result = jt.queryForObject("select count(*) from [RLD].[dbo].[StudentSpring]", new Object[]{}, Integer.class);
		int result = jt.queryForObject("select count(*) from USA_Holidays", new Object[]{}, Integer.class);
		
			
		return result;
	}
	
	public int insertInfo(String no, String name, String add) {
		int result = jt.update("insert into [RLD].[dbo].[StudentSpring] values(?,?,?)", new Object[] {no, name, add});
		return result;
	}
	
	public Map getStudentDetails(String StudentId) {
		Map result = jt.queryForMap("select * from [RLD].[dbo].[StudentSpring] where StudentId=?", new Object[] {StudentId});
		return result;
	}

}
