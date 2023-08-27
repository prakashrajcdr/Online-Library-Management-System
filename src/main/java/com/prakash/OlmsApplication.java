package com.prakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class OlmsApplication {

	public static void main(String[] args) {
		System.out.println("I am from OLMS Application");
		SpringApplication.run(OlmsApplication.class, args);
	}

}
