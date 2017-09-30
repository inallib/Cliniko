package com.cliniko.zuul;

/**
 * Created by ss on 30-09-2017.
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class ClinikoZuulProxy {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ClinikoZuulProxy.class).web(true).run(args);
    }
}
