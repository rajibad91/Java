package com.example.spring.Shopping_Cart;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationBean {

	JdbcTemplate jt;

	public DBOperationBean(JdbcTemplate template) {
		this.jt = template;
	}

}
