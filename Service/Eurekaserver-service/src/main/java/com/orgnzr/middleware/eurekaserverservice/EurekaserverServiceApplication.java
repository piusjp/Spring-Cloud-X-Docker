package com.orgnzr.middleware.eurekaserverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverServiceApplication.class, args);
	}
}
