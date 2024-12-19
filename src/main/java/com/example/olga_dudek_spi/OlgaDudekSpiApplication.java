package com.example.olga_dudek_spi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OlgaDudekSpiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlgaDudekSpiApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Dr. Niepostyn") String name) {
		return String.format("Witam %s!", name);
	}

}
