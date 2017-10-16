package com.cliniko.searchResult;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClinikoSearchResultDaoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinikoSearchResultDaoServiceApplication.class, args);
	}
}
