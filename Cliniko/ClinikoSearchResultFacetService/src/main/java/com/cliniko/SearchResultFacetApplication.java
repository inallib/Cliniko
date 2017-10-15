package com.cliniko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by ss on 15-10-2017.
 */
@SpringBootApplication
@EnableEurekaClient
public class SearchResultFacetApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchResultFacetApplication.class, args);
    }
}
