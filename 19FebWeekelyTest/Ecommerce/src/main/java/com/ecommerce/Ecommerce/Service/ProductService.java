package com.ecommerce.Ecommerce.Service;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.weaver.reflect.IReflectionWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce.Model.Product;
import com.ecommerce.Ecommerce.Repository.IProductRepo;


@Service
public class ProductService {
	
	@Autowired
	private IProductRepo iProductRepo;

	public List<Product> getAllProduct(String category) {
		List<Product> products;
		if(category!=null) {
			products=new ArrayList<>();
			products.addAll(iProductRepo.findByCategory(category));
		}
		else {
			products=iProductRepo.findAll();
		}
		return products;
	}

	public ResponseEntity<String> deleteById(Integer productId) {
		try {
			if(productId!=null) {
				iProductRepo.deleteById(productId);
				return new ResponseEntity<>("Delete Product ", HttpStatus.ACCEPTED);
			}
			else {
				return new ResponseEntity<>("Please enter Id ", HttpStatus.ACCEPTED);
			}
		
		}
		catch (Exception e) {
			return new ResponseEntity<>(e.toString(), HttpStatus.NOT_FOUND);
		}
		
		
	}

}
