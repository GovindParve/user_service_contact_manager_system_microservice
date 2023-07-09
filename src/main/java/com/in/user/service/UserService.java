package com.in.user.service;

import org.springframework.stereotype.Service;

import com.in.user.entity.User;

@Service
public interface UserService {
	
	
	public User getUser(Long id);

}
