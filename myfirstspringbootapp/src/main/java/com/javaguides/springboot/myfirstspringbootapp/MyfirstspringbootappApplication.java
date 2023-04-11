package com.javaguides.springboot.myfirstspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan
public class MyfirstspringbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstspringbootappApplication.class, args);
	}

	/*@GetMapping("/welcome")
	public String welcome() {
		String welcomeMsg;
		welcomeMsg = "Welcome to Spring boot Planet!";
		String welcomeMsgNote = welcomeMsg;
		return welcomeMsgNote;
	}*/
}
