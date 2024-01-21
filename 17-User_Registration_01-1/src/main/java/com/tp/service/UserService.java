package com.tp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tp.model.User;

@Service
public interface UserService {
	
	public User updateUserDetail(User user1);

	public User getUser(Integer userId);

	public List<User> getAllUser();

	public User insertUser(User us1);
	
    public void deleteAllUser();

	public void deleteOneUser(Integer userId);

	

}
