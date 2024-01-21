package com.dakr.service;

import com.dakr.dto.RegisterDto;
import com.dakr.model.User;


public interface UserService {
	public String userRegister(RegisterDto reg);

	 public boolean userLogin(String email, String pwd);

	 public String userForgotPassword(String email, String pwd, String confPwd);

}
