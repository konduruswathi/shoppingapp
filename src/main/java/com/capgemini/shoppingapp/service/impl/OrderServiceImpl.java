package com.capgemini.shoppingapp.service.impl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.shoppingapp.controller.OrderController;
import com.capgemini.shoppingapp.entity.Items;
import com.capgemini.shoppingapp.entity.Order;
import com.capgemini.shoppingapp.repository.OrderRepository;
import com.capgemini.shoppingapp.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;
	private HashMap<Integer, Set<Items>> map = new HashMap();

	@Override
	public void addItems(Items items, int customerId) {
		Set<Items> tempItem = map.get(customerId);
		if (tempItem == null) {
			tempItem = new HashSet();
			tempItem.add(items);
			map.put(customerId, tempItem);
		}
		if (tempItem != null)
			tempItem.add(items);
		map.put(customerId, tempItem);
	}

	@Override
	public Set<Items> getItems(Items items, int customerId) {
		Set<Items> tempItem = map.get(customerId);
		return map.get(tempItem);
	}

	@Override
	public void removeItemById(Items items, int customerId) {
		Set<Items> tempitems = map.get(customerId);
		if (tempitems != null) {
			tempitems.remove(items);
			map.put(customerId, tempitems);
		}
	}

	@Override
	public List<Order> getOrders() {

		return orderRepository.findAll();
	}

	@Override
	public Order getOrderById(int orderId) {

		Optional<Order> order = orderRepository.findById(orderId);
		if (order.isPresent())
			order.get();
		return orderRepository.save(order.get());
	}

	@Override
	public Order submitOrder(Order order) {
		/*
		 * Order order = new Order(); order.setCustomerId(customerId);
		 * order.setItems(map.get(customerId)); order.setTotal(1000)
		 */
		order.setOrderdate(LocalDate.now());

		return orderRepository.save(order);
	}

	@Override
	public Order deleteOrder(int orderId) {
		Optional<Order> optional = orderRepository.findById(orderId);
		if (optional.isPresent()) {
			optional.get().setStatus("Deleted");
//			return orderRepository.save(optional.get());
			return optional.get();
		}
		return null;
		
	}

	@Override
	public Order cancelOrder(int orderId) {
		Optional<Order> optionalOrder = orderRepository.findById(orderId);
		if (optionalOrder.isPresent())
			optionalOrder.get().setStatus("cancelled");
		return orderRepository.save(optionalOrder.get());
	}

}
