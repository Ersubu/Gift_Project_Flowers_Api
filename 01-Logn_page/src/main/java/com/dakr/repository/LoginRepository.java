package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.model.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {
	Login findByUsernameAndPassword(String username, String password);

}
