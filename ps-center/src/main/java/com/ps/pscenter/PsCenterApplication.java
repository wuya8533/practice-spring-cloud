package com.ps.pscenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PsCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsCenterApplication.class, args);
	}

}
