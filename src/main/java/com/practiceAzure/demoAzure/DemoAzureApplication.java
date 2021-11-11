package com.practiceAzure.demoAzure;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class DemoAzureApplication {
	
	@GetMapping("/message")
	public String message() {
		return " Congratulations ! we have deployed our application on Azure Successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoAzureApplication.class, args);
	}

}
