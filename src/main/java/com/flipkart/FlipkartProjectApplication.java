package com.flipkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Flipkart REST API", description = "Rest api which has endpoints for performing crud operation on Flipkart table", version = "1.0.0", contact = @Contact(name = "Yuke", email = "yukenthirans2018@gmail.com", url = "https://www.github.com/yuke001")))
public class FlipkartProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipkartProjectApplication.class, args);
	}

}
