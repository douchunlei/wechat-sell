package cn.haitao.start.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.haitao.start.domain.User;
import cn.haitao.start.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@RequestMapping("list")
	public List<User> list(){
		List<User> list = userService.findAllUser();
		return list;
	}
	
	
}
