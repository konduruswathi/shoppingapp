package com.capgemini.shoppingapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Items {
	@Id

	private int itemQuantity;

	private int productId;

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(int itemQuantity, int productId) {
		super();
		this.itemQuantity = itemQuantity;
		this.productId = productId;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Items [itemQuantity=" + itemQuantity + ", productId=" + productId + "]";
	}
}