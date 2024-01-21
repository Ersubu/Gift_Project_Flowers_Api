package com.dakr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.entity.Doctor;
import com.dakr.service.DoctorService;
import com.dakr.service.DoctorServiceImpl;

@RestController
public class DoctorController {
	
	@Autowired
	DoctorServiceImpl ser;
	
	@PostMapping("/save")
	public Doctor saveDoct(@RequestBody Doctor doctor) {
		 return ser.saveDoctor(doctor);
		
	}
  @GetMapping("/getAll")
	
	public List<Doctor> getAll(){
		return ser.getAllStudent();
	}
}

