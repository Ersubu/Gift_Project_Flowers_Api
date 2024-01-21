package com.tp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	
	 @Id
	 private Integer userId;
	 private String userFirstName;
	 private String userLastName;
	 
	

}
