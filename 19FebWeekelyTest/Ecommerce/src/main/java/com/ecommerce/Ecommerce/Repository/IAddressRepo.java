package com.ecommerce.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Ecommerce.Model.Address;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer>{

}
