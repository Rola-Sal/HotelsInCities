package com.project.HotelsInCities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelsInCitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelsInCitiesApplication.class, args);
	}
}
