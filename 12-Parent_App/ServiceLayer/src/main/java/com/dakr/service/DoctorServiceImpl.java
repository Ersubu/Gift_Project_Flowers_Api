package com.dakr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.email.EmailService;
import com.dakr.entity.Doctor;
import com.dakr.repo.DoctorRepo;

@Service
public class DoctorServiceImpl implements DoctorService {

	
	@Autowired
	DoctorRepo repo;
	@Autowired
	private EmailService service;

	@Override
	public Doctor saveDoctor(Doctor doctor) {

		return repo.save(doctor);
	}

	public List<Doctor> getAllStudent() {
		
		service.sendEmail();
		return repo.findAll();
	}

	
	
	

}
