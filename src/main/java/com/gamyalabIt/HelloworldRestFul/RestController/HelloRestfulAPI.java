package com.gamyalabIt.HelloworldRestFul.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestfulAPI {
	
	@GetMapping("/aws")
	public String Hello() {
		return "Hai All Wel come to Java world ";
	}

}
