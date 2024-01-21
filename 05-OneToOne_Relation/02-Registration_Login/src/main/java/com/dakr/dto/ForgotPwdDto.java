package com.dakr.dto;

import lombok.Data;

@Data
public class ForgotPwdDto {
	private String email;
	 private String pwd;
	 private String confPwd;
}
