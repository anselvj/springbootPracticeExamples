package com.javaguides.mysecondspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.javaguides.mysecondspringboot.controller"})
public class MysecondspringbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysecondspringbootappApplication.class, args);
	}

}
