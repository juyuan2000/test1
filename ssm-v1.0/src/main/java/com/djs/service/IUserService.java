package com.djs.service;

import java.util.List;

import com.djs.entity.User;

public interface IUserService {
	
	List<User> findAllUser();
	void addUser(String username,String password);
	void deleteUser(int id);

}
