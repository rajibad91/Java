package com.example.spring.Shopping_Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="service")
public class ServiceClass {

	@Autowired
	private CategoryDAO category;
	@Autowired
	private ProductDAO product;
	@Autowired
	private ProductDetailsDAO prodDetails;

	public CategoryDAO getCategory() {
		return category;
	}

	public void setCategory(CategoryDAO category) {
		this.category = category;
	}

	public ProductDAO getProduct() {
		return product;
	}

	public void setProduct(ProductDAO product) {
		this.product = product;
	}

	public ProductDetailsDAO getProdDetails() {
		return prodDetails;
	}

	public void setProdDetails(ProductDetailsDAO prodDetails) {
		this.prodDetails = prodDetails;
	}

}
