package com.capgemini.shoppingapp.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.shoppingapp.entity.Items;
import com.capgemini.shoppingapp.entity.Order;
import com.capgemini.shoppingapp.repository.OrderRepository;
import com.capgemini.shoppingapp.service.OrderService;
import com.mongodb.client.model.ReturnDocument;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/addItem/{customerId}")
	public ResponseEntity<Items> addLineItem(@RequestBody Items item, @PathVariable int customerId) {
		orderService.addItems(item, customerId);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/order")
	public ResponseEntity<Order> submitOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.submitOrder(order), HttpStatus.OK);

	}

	@GetMapping("/cancel/{orderId}")
	public ResponseEntity<Order> cancelOrder(@PathVariable int orderId) {
		ResponseEntity<Order> response = new ResponseEntity<Order>(orderService.cancelOrder(orderId), HttpStatus.OK);
		return response;

	}

	@GetMapping("/getItems/{customerId}")
	public ResponseEntity<Set<Items>> getLineItems(@RequestBody Items items, @PathVariable int customerId) {
		ResponseEntity<Set<Items>> response = new ResponseEntity<Set<Items>>(orderService.getItems(items, customerId),
				HttpStatus.OK);
		return response;
	}

	@DeleteMapping("/order/remove")
	public ResponseEntity<Set<Items>> removeLineItems(@RequestBody Items items, @RequestParam int customerId) {
		orderService.removeItemById(items, customerId);
		return new ResponseEntity<Set<Items>>(HttpStatus.OK);
	}

	@GetMapping("/order/delete")
	public ResponseEntity<Order> deleteOrder(@RequestParam int orderId) {
		orderService.deleteOrder(orderId);
		return new ResponseEntity<Order>(HttpStatus.OK);
	}

	@GetMapping("/order/getorders")
	public ResponseEntity<Order> getOrderById(@RequestParam int orderId) {
		ResponseEntity<Order> responseEntity = new ResponseEntity<Order>(orderService.getOrderById(orderId),
				HttpStatus.OK);
		return responseEntity;

	}

	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getOrders() {
		ResponseEntity<List<Order>> responseEntity = new ResponseEntity<List<Order>>(orderService.getOrders(),
				HttpStatus.OK);
		return responseEntity;

	}

}
