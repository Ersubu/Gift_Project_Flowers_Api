package com.dakr.service;

import com.dakr.exception.UserException;
import com.dakr.model.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
