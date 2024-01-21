package com.tp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tp.model.User;
import com.tp.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/insert")
	public User saveStudent(@RequestBody User us1) {
		
		return service.insertUser(us1);
	}
	
	@GetMapping("/getone/{stdId}")
	public User getOneUser(@PathVariable Integer stdId) {
		
		return service.getUser(stdId);
	}
	
	@GetMapping("/getAll")
	
	public List<User> getAll(){
		return service.getAllUser();
	}
 
	@PutMapping("/update")
	public User updateUser(@RequestBody User user1) {
		return service.updateUserDetail(user1);
	}
	
	@DeleteMapping("/deleteOne/{userId}")
	public void deleteOne(@PathVariable Integer userId) {
	    service.deleteOneUser(userId);
	
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteAll() {
		service.deleteAllUser();
	}

}
