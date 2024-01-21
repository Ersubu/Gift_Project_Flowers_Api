package com.dakr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/")
	public String getmsg() {
		return "hellow subu";
	}
	
	
	

}
