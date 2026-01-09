package com.example.SupplyCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.SupplyCore")
public class SupplyCoreApplication {

	public static void main(String[] args) {

		System.out.println("Hello World !!!");
		SpringApplication.run(SupplyCoreApplication.class, args);
	}

}
