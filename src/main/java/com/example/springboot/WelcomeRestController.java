package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping
	public String getMsg() {
		return "Welcome to Docker Learning...!!" ;
	}
	
	
	
	
}
