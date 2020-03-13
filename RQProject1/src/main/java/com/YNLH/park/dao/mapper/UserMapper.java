package com.YNLH.park.dao.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.YNLH.park.dao.entity.User;
@Repository
public interface UserMapper {
	public int registerUser(User user);
	public User findUser(String account) throws Exception;
	public User findUserById(int uid) throws Exception;
	public User login(String account, String password) throws Exception;
}
