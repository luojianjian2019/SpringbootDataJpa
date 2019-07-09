package com.luo.study002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class Study002Application {

    public static void main(String[] args) {
        SpringApplication.run(Study002Application.class, args);
    }

}
