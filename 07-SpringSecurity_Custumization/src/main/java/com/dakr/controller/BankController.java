package com.dakr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	
	@GetMapping("/balance")
	
	public String Balance() {
		
		return "Your Balance is 1cr..";
	}
	
	@GetMapping("/transfer")
	public String amtTransfer() {
		
		return "your amount transfer successfull";
		
	}
	
	@GetMapping("/loginCheck")
	public String login() {
		
		return "your login successfull";
		
	}
	@GetMapping("/about")
	public String ContactUs() {
		
		return "Contact us: Subu@bank.com";
		
	}
	
	
	

}
