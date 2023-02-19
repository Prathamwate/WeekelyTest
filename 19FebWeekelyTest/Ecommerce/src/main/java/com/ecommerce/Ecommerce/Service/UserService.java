package com.ecommerce.Ecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce.Model.User;
import com.ecommerce.Ecommerce.Repository.IUserRepository;

@Service
public class UserService {
	
	@Autowired
	private IUserRepository iUserRepository;

	public User getUserById(Integer userId) {
		User user=iUserRepository.findById(userId).get();
		return user;
	}

}
