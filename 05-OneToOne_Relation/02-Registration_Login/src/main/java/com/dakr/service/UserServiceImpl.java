package com.dakr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.dto.RegisterDto;
import com.dakr.model.User;
import com.dakr.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	 @Autowired
	 public UserRepository repo;

	 @Override
	 public String userRegister(RegisterDto reg) {
       String temp = "";
	  if (reg != null) {
	   User user =  User.Builder(0,reg.getName(), reg.getEmail(), reg.getPhno(), reg.getPassword());
	   //BeanUtils.copyProperties(reg, user);
	   repo.save(user);
	   temp = "registeration successfull...";

	  } else {
	   temp = "Fail to register";
	  }
	  return temp;

	 }

	 @Override
	 public boolean userLogin(String email, String pwd) {
	  boolean flag = false;
	  User entity = repo.findByEmailAndPassword(email, pwd);
	  
	  if(entity!=null)
	  {
	   flag=true;
	  }
	  
	  return flag;
	  
	 }

	 @Override
	 public String userForgotPassword(String email, String pwd, String confPwd) {
	  
	  User entity = repo.findByEmail(email);
	  if(email.equals(entity.getEmail()))
	  {
	   if(pwd.equals(confPwd))
	   {
	    entity.setPassword(pwd);
	    
	    repo.save(entity);
	    return "Password Reset Successfully...";
	   }
	   else
	   {
	    return "Your password and conform password is not same..";
	   }
	   
	  }
	  else
	  {
	   return "Please Enter Valid Email....";
	  }
	  
	 }

}
