package io.ksiegarnia.Informacje_ksiazki_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InformacjeKsiazkiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InformacjeKsiazkiServiceApplication.class, args);
	}

}
