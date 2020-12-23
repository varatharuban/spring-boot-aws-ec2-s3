package com.rubanelearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/")
	public String getIndex() {
		return "This is index page. ha ha :)";
	}
	
	@GetMapping("/orders")
	public String getOrders() {
		return "This API will returns orders of this user :)";
	}
}