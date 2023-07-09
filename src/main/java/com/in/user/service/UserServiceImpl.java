package com.in.user.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.in.user.entity.User;

@Component
public class UserServiceImpl implements UserService {
	
	
	List<User> list = List.of(
			new User(1311L, "Govind Parve", "1234567890"),
			new User(1312L, "Mahesh Patil", "9987654321"),
			new User(1313L, "Vikas Kale", "6789054321")
		);
	
	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
	
	

}
