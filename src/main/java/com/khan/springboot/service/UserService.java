package com.khan.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.khan.springboot.model.User;
import com.khan.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}