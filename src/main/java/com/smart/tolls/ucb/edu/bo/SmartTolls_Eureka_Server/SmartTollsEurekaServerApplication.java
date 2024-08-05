package com.smart.tolls.ucb.edu.bo.SmartTolls_Eureka_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SmartTollsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartTollsEurekaServerApplication.class, args);
	}

}
