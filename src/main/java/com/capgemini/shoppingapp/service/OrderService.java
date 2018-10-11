package com.capgemini.shoppingapp.service;

import java.util.List;
import java.util.Set;
import com.capgemini.shoppingapp.entity.Items;
import com.capgemini.shoppingapp.entity.Order;

public interface OrderService {
	public void addItems(Items items, int customerId);

	public Set<Items> getItems(Items items, int customerId);

	public void removeItemById(Items items, int customerId);

	public List<Order> getOrders();

	public Order getOrderById(int orderId);

	public Order submitOrder(Order order);

	public Order deleteOrder(int orderId);

	public Order cancelOrder(int orderId);

}
