package com.example.springdocnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public OpenAPI openAPI() {
		Info info = new Info().title("Spring Doc Native").description("Spring Doc Native");
		return new OpenAPI().info(info);
	}
}
