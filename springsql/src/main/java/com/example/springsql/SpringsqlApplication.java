package com.example.springsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class SpringsqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsqlApplication.class, args);
		System.out.println("Hello World");
	}

}
