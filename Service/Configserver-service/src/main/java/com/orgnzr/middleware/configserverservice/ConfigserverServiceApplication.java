package com.orgnzr.middleware.configserverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverServiceApplication.class, args);
	}
}
