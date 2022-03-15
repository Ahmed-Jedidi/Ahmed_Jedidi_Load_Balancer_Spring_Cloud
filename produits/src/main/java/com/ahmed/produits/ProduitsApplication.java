package com.ahmed.produits;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@RequestMapping("/testi")
public class ProduitsApplication {
	
	@Value("${server.port}")
	private String port;

	@GetMapping("/port")
	public String chatNow() {
		return "application is up on port : " + port;
	}
	
	@GetMapping("/")
	public String refresh() {
		return "rien";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProduitsApplication.class, args);
	}

}