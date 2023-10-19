package com.mini.Lulu02_API_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Lulu02ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lulu02ApiGatewayApplication.class, args);
	}

}
