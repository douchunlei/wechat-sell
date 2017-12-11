package cn.haitao.start.service;

import java.util.List;
import java.util.Map;

import cn.haitao.start.domain.User;

public interface UserService {
	
	/**
	 * 根据接口查询所用的用户
	 */
	public List<User> findAllUser();

	public Map<String, Object> redisMap();
}
