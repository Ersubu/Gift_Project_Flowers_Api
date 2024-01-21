package com.dakr.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="User_Table")
public class User {
	
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int personid;
	  private String userName;
	  private String usergender;
	  @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	  private Adhar adhar;

}
