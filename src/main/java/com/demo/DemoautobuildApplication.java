package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoautobuildApplication {
	
	@RequestMapping("/")
	public String home(){
		return "Hello docker world!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoautobuildApplication.class, args);
	}

}
