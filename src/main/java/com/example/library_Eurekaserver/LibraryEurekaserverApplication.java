package com.example.library_Eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LibraryEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryEurekaserverApplication.class, args);
		System.out.println("------------Eureka server started--------------");
	}

}
