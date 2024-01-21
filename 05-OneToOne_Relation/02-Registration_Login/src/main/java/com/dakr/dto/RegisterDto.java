package com.dakr.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterDto {
	
    // @NotNull(message = "name should not be null")
	 private String name;
//	 @Email(message = "invalid email address")
//	 @NotNull(message = "valid email required")
	 private String email;
	// @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number")
	 private String phno;
	
	 private String password;

}
