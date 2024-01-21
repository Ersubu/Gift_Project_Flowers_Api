package com.dakr.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Doctor {
	@Id
	private Integer id;
	private String name;
	private String specialist;
	

}
