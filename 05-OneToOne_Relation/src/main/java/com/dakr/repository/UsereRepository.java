package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.model.User;

public interface UsereRepository extends JpaRepository<User, Integer> {

}
