package com.cognixia;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@Value("${server.port}")
	private int port;

	@GetMapping("/hello")
	public String greeting() {
		return "Hello from Country Service Client! from port:   " + port;
	}
	
	@GetMapping("/countries")
	public String displayCountries() {
		return CountryService.displayCountries();
	}
}
