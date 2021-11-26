package com.tsi.murray.ben.SpringBootCocktail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCocktailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCocktailApplication.class, args);
	}

	@CrossOrigin("http://localhost:8080")
	@GetMapping("/customRoute")
	public String myResponse() {
		CocktailInstructions cocktailInstructions = new CocktailInstructions();
		return cocktailInstructions.toString();
	}

}
