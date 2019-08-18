package com.djs.controllers;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djs.dto.ResponseResult;
import com.djs.service.IUserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Resource
	private IUserService ius;

	@GetMapping("/findAll")
	public ResponseResult findAll() {
		ResponseResult rr = new ResponseResult(200, "全查询成功", ius.findAllUser());
		return rr;
	}
	@PutMapping("/add/username/{username}/password/{password}")
	public ResponseResult add(
			@PathVariable("username")String username,
			@PathVariable("password")String  password
			) {
		ius.addUser(username, password);
		ResponseResult rr = new ResponseResult(200, "添加数据成功", ius.findAllUser());
		return rr;
	}
	@DeleteMapping("/delete/id/{id}")
	public ResponseResult delete(
			@PathVariable("id")int id
			) {
		ius.deleteUser(id);
		ResponseResult rr = new ResponseResult(200, "删除数据成功", ius.findAllUser());
		return rr;
	}
	
	

}
