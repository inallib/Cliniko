package com.cliniko.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClinikoEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinikoEurekaApplication.class, args);
	}
}
