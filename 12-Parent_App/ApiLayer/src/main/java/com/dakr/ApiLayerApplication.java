package com.dakr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiLayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiLayerApplication.class, args);
		System.out.println("Application running fine");
	}

}
