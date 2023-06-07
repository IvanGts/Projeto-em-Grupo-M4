package com.valdisnei.valdisnei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ValdisneiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValdisneiApplication.class, args);
	}

}
