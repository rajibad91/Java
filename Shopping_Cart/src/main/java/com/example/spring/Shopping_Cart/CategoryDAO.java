package com.example.spring.Shopping_Cart;

import java.util.Map;

public class CategoryDAO {
	private Map<String, String> categoryName;

	public Map<String, String> getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(Map<String, String> categoryName) {
		this.categoryName = categoryName;
	}

}
