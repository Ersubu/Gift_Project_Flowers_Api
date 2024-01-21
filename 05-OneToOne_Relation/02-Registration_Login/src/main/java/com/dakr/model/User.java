package com.dakr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor(staticName = "Builder")
@Entity
@Data
@Table(name="USER_DTLS_ENTITY")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer userId;
 private String name;
 private String email;
 private String phno;
 private String password;
 
 

}
