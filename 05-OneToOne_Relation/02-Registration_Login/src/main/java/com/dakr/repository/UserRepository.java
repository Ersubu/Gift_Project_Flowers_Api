package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmailAndPassword(String email, String pwd);

	User findByEmail(String email);

}
