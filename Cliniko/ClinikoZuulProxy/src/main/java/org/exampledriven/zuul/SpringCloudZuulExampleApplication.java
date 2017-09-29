package org.exampledriven.zuul;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.net.MalformedURLException;

@EnableZuulProxy
@SpringBootApplication
public class SpringCloudZuulExampleApplication {

    public static void main(String[] args) throws MalformedURLException {
        SpringApplication.run(SpringCloudZuulExampleApplication.class, args);
    }
}
