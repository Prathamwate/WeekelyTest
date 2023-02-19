package com.ecommerce.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Ecommerce.Model.Order;

@Repository
public interface IOrderRepo  extends JpaRepository<Order, Integer>{

}
