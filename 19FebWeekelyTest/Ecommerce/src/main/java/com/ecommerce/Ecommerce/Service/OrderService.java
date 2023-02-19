package com.ecommerce.Ecommerce.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce.Model.Order;
import com.ecommerce.Ecommerce.Repository.IOrderRepo;

@Service
public class OrderService {
	
	@Autowired
	private IOrderRepo iOrderRepo;

	public List<Order> getOrder(Integer orderid) {
		List<Order> orders = new ArrayList<>();
		 orders.add(iOrderRepo.findById(orderid).get());
		 return orders;
	}

//	public List<Order> getOrderById() {
//		List<Order> orderList=new ArrayList<>();
//		orderList=iOrderRepo.findAll();
////		Order order= iOrderRepo.findById(OrderId).get();<
////		
////		JSONArray jsonArray = new JSONArray();
////		
////		JSONObject json = new JSONObject();
////		
////		json.put("orderId", order.getId());
////		json.put("userId",order.getUser().getId());
////		json.put("productId", order.getProduct().getId());
////		json.put("addressId", order.getAddress().getId());
////		json.put("quantity", order.getProductQuantity());
////		
////		jsonArray.put(json);
////		
////		return jsonArray;
//		return orderList;		
//	}

}
