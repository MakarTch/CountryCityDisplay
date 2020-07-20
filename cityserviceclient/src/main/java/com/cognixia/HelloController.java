package com.cognixia;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@Value("${server.port}")
	private int port;

	@GetMapping("/hello")
	public String greeting() {
		return "Hello from City Service Client! from port:   " + port;
	}
	
	@GetMapping("/cities")
	public String displayCities() {
		return CityService.displayCities();
	}
	
	@GetMapping("cities/{country}")
	public String displayCitiesInCountry(@PathVariable String country) {
		return CityService.displayCitiesInCountry(country);
	}
}
