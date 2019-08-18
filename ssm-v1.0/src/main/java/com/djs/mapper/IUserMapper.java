package com.djs.mapper;

import java.util.List;

import com.djs.entity.User;

public interface IUserMapper {
	
	List<User> findAll();
	void  save(User user);
	void delete(int id);

}
