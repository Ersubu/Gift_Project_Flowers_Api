package com.dakr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.dto.RegisterDto;
import com.dakr.service.UserServiceImpl;

@RestController
public class UserController {
	  
	 @Autowired
	 private UserServiceImpl service;
	 //for user registration
	 
	 @PostMapping("/save")
	 public String register(@RequestBody  RegisterDto reg)
	 {
	  return service.userRegister(reg);
	 }
	 
	 // for user login
	 @PostMapping("/login")
	 public String login(@RequestParam("email")String email,@RequestParam("pwd") String pwd )
	 {
	  String temp="";
	  if(service.userLogin(email,pwd)==true)
	  {
	   temp="Login successfully...";
	  }
	  else
	  {
	   temp="Fail to login....";
	  }
	  return temp;
	 }
	 
	 //for forgot password
	 @PostMapping("/forgot")
	 public String forgotPwd(@RequestParam("email") String email,@RequestParam("pwd")String pwd,@RequestParam("confPwd")String confPwd)
	 {
	  return service.userForgotPassword(email,pwd,confPwd);
	 }

}
