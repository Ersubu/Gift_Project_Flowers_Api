package com.tp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.model.User;
import com.tp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repo;
    
	public User insertUser(User us1) {
		
		return repo.save(us1);
	}

	@Override
	public User updateUserDetail(User user1) {
		// TODO Auto-generated method stub
		return repo.save(user1);
	}

	@Override
	public User getUser(Integer userId) {
		// TODO Auto-generated method stub
		return repo.findById(userId).get();
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteAllUser() {
		repo.deleteAll();
		
	}

	@Override
	public void deleteOneUser(Integer userId) {
		repo.deleteById(userId);
		
	}

}
