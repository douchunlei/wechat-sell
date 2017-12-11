package cn.haitao.start.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.haitao.start.domain.User;
import cn.haitao.start.mapper.UserMapper;
import cn.haitao.start.service.UserService;
import redis.clients.jedis.JedisCluster;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	/*@Autowired
	private JedisCluster jedisCluster;*/
	
	
	public List<User> findAllUser() {
		System.out.println("测试缓存，第二次查询不走方法!!!");
		List<User> list = userMapper.findAll();
		return list;
	}


	@Override
	public Map<String, Object> redisMap() {
		// TODO Auto-generated method stub
		return null;
	}



}
