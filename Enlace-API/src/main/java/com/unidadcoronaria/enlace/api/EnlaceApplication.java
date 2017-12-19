package com.unidadcoronaria.enlace.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
public class EnlaceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EnlaceApplication.class, args);
	}
	
}
