package com.djs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.djs.entity.User;
import com.djs.mapper.IUserMapper;
import com.djs.service.IUserService;

@Service("ius")
@Transactional
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserMapper iUserMapper;

	@Transactional(propagation = Propagation.NEVER)
	@Override
	public List<User> findAllUser() {
		List<User> list = iUserMapper.findAll();
		return list;
	}

	@Override
	public void addUser(String username, String password) {
		iUserMapper.save(new User(0,username,password));
	}

	@Override
	public void deleteUser(int id) {
		iUserMapper.delete(id);
		
	}

}
