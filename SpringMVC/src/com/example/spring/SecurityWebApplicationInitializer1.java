package com.example.spring;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;


public class SecurityWebApplicationInitializer1 extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer1() {
		super(SecurityConfig.class);
	}

}
