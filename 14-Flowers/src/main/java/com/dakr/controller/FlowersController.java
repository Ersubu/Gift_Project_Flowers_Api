package com.dakr.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.model.FlowersInfo;
import com.dakr.service.FlowerService;


@RestController
public class FlowersController {
	
	@Autowired
	private FlowerService flowerService;
	
	@PostMapping("/save")
	public FlowersInfo saveFlower(@Valid@RequestBody FlowersInfo flow) {
		
		return flowerService.insertFlowers(flow);
	}
	@GetMapping("/getone/{flowerId}")
	public FlowersInfo getOneFlower(@PathVariable Long flowerId) {
		
		return flowerService.getFlower(flowerId);
	}
	
	@GetMapping("/getAll")
	
	public List<FlowersInfo> getAll(){
		return flowerService.getAllFlowers();
	}
	
	
	@PutMapping("/update")
	public FlowersInfo updateStudent(@RequestBody FlowersInfo flower) {
		return flowerService.updateStudentRecord(flower);
	}
	 
	
	
	@DeleteMapping("/deleteOne/{flowerId}")
	public void deleteOne(@PathVariable Long flowerId) {
	    flowerService.deleteOneFlower(flowerId);
	
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteAll() {
		flowerService.deleteAllFlower();
	}

}
