package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.model.FlowersInfo;

public interface FlowerRepo extends JpaRepository<FlowersInfo, Long>{

}
