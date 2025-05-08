package com.vineet.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//This annotation is used to enable the Eureka server functionality in the Spring Boot application.
public class DemoSpringEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringEurekaServiceApplication.class, args);
	}

}
