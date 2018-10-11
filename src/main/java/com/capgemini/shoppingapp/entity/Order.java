package com.capgemini.shoppingapp.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="orders")
public class Order {
	@Id
	private int orderId;
	private double orderAmount;
	private LocalDate orderdate;
	private int customerId;
	private Set<Items> items;
	private String status;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, double orderAmount, LocalDate orderdate, int customerId, Set<Items> items,
			String status) {
		super();
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderdate = orderdate;
		this.customerId = customerId;
		this.items = items;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public LocalDate getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderAmount=" + orderAmount + ", orderdate=" + orderdate
				+ ", customerId=" + customerId + ", items=" + items + ", status=" + status + "]";
	}
	
}