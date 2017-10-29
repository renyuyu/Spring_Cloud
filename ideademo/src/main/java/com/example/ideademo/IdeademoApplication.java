package com.example.ideademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class IdeademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdeademoApplication.class, args);
	}
}