package com.american.freeworld.vector.eurekaservers1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekaservers1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaservers1Application.class, args);
	}

}
