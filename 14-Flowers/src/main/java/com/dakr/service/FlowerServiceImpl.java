package com.dakr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.model.FlowersInfo;
import com.dakr.repository.FlowerRepo;

@Service
public class FlowerServiceImpl implements FlowerService {
	
	@Autowired
	private FlowerRepo repo;
	@Override
	public FlowersInfo insertFlowers(FlowersInfo flow) {
		
		return repo.save(flow);
	}
	@Override
	public FlowersInfo getFlower(Long flowerId) {
		// TODO Auto-generated method stub
		return repo.findById(flowerId).get();
	}
	@Override
	public List<FlowersInfo> getAllFlowers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public FlowersInfo updateStudentRecord(FlowersInfo flower) {
		// TODO Auto-generated method stub
		return repo.save(flower);
	}
	@Override
	public void deleteOneFlower(Long flowerId) {
		repo.deleteById(flowerId);
		
	}
	@Override
	public void deleteAllFlower() {
		repo.deleteAll();
		
	}
	

}
