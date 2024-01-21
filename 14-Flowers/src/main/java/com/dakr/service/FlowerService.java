package com.dakr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dakr.model.FlowersInfo;

@Service
public interface FlowerService {

	public FlowersInfo insertFlowers(FlowersInfo flow);

	public FlowersInfo getFlower(Long flowerId);

	public List<FlowersInfo> getAllFlowers();

	public FlowersInfo updateStudentRecord(FlowersInfo flower);

	public void deleteAllFlower();

	public void deleteOneFlower(Long flowerId);

}
