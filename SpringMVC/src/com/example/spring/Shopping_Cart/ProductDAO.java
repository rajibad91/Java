package com.example.spring.Shopping_Cart;

import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class ProductDAO {

	private Map<String, String> productName;

	public Map<String, String> getProductName() {
		return productName;
	}

	public void setProductName(Map<String, String> productName) {
		this.productName = productName;
	}

	

}
