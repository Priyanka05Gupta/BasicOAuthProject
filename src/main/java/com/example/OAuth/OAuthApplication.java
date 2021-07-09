package com.example.OAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//https://www.codejava.net/frameworks/spring-boot/spring-boot-security-role-based-authorization-tutorial
@SpringBootApplication
public class OAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthApplication.class, args);
		
		/*
		 * BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); String
		 * rawPassword ="corejava"; String encPwd = encoder.encode(rawPassword);
		 * 
		 * System.out.println(encPwd);
		 */
		
	}

}
