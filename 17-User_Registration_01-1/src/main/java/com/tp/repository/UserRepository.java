package com.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
