package com.dakr.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Adhar {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long adharId;
	  private long adharEnlNo;
	  private long  adharNo;
	  private LocalDate issueDate;
	 
	  @OneToOne
	  @JoinColumn(name="userId")
	  private User user;

}
