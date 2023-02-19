package com.ecommerce.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Ecommerce.Model.Order;
import com.ecommerce.Ecommerce.Service.OrderService;



@RestController
//@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping(value = "getOrder/{orderid}")
	public List<Order> getOrderById(@PathVariable Integer orderid) {
		return orderService.getOrder(orderid);
	}
	
	
}
