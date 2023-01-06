package com.pictu.customer.services;

import java.util.List;


import com.pictu.customer.payloads.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserbyId(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
