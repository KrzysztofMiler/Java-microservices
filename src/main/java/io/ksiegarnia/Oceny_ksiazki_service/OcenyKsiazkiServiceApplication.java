package io.ksiegarnia.Oceny_ksiazki_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OcenyKsiazkiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcenyKsiazkiServiceApplication.class, args);
	}

}
