package com.ecommerce.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Ecommerce.Model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
