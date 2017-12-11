package cn.haitao.start.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.haitao.start.domain.User;
@Mapper
public interface UserMapper {
	
	public List<User> findAll();

}
