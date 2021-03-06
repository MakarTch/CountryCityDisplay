package com.cognixia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CityServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityServiceClientApplication.class, args);
	}
}
