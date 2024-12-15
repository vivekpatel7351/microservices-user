package com.lcwd.user.service.services;

import java.util.List;

import com.lcwd.user.service.entity.User;

public interface UserService {
	
	//create user
	User saveUser(User user);
	
	//get all user
	List<User> getAllUser();
	
    //get single user by id
	User getUser(String userId);
	
	//delete user
	void deleteUser(String userId);
	
	//update user
	void updateUser(User user);

}
