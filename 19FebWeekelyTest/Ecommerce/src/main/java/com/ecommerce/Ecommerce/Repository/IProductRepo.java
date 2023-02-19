package com.ecommerce.Ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Ecommerce.Model.Product;


@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {
	
	public List<Product> findByCategory(String category);

}
