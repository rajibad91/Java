package com.example.spring.Shopping_Cart;

public class Service {

	private CategoryDAO category;
	private ProductDAO product;
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
