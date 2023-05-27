package com.sporty.shoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.sporty.shoes")
@EntityScan("com.sporty.shoes.ShoesModel")
@EnableJpaRepositories("com.sporty.shoes.dao")
public class SportyShoesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesAppApplication.class, args);
		
		
		System.out.println("Welcome to spring boot application");
	}

}
