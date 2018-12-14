package com.loginshiroservice.loginshiroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient
public class LoginshiroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginshiroserviceApplication.class, args);
	}

}

