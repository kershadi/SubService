package com.example.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = {"com.example.controller"})
public class MulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MulServiceApplication.class, args);
	}
}
