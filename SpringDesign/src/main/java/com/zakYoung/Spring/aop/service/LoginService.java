package com.zakYoung.Spring.aop.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	private Log log = LogFactory.getLog(LoginService.class);
	
	public String doRegister(){
		log.info("学生注册");
		return null;
	}
	
	
}
