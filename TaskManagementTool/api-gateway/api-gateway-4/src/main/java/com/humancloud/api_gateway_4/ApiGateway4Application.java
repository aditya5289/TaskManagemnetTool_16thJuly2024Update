package com.humancloud.api_gateway_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateway4Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateway4Application.class, args);
	}

}
