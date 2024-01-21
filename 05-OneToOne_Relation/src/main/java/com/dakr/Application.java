package com.dakr;


import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dakr.model.Adhar;
import com.dakr.model.User;
import com.dakr.repository.AdharReepository;

import com.dakr.repository.UsereRepository;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	  ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
	  AdharReepository adharRepo=context.getBean(AdharReepository.class);
	  UsereRepository userRepo=context.getBean(UsereRepository.class);
	  
	  
	  
	  User user=new User();
	  user.setUserName("Satya");
	  user.setUsergender("Male");
	  Adhar adhar=new Adhar();
	  adhar.setAdharEnlNo(823344546);
	  adhar.setAdharNo(856565454);
	  adhar.setIssueDate(LocalDate.now());
	  
	  user.setAdhar(adhar);
	  adhar.setUser(user);
	  userRepo.save(user);
	  
	  
	 
	  
	  
	 
		
	}

}
