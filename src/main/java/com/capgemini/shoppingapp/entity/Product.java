package com.capgemini.shoppingapp.entity;

import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="products")
public class Product {
	@Id
	private int productId;
	private String productName;
	private String productCategory;
	private double price;
	private HashMap<String ,Object> productSpecifications;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, String productCategory, double price,
			HashMap<String, Object> productSpecifications) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.price = price;
		this.productSpecifications = productSpecifications;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public HashMap<String, Object> getProductSpecifications() {
		return productSpecifications;
	}
	public void setProductSpecifications(HashMap<String, Object> productSpecifications) {
		this.productSpecifications = productSpecifications;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", price=" + price + ", productSpecifications=" + productSpecifications + "]";
	}
	
}


