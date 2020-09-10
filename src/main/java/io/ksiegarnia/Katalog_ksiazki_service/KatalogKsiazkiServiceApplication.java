package io.ksiegarnia.Katalog_ksiazki_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class KatalogKsiazkiServiceApplication {

	@Bean//jest bean aby był singeton i nie brał niepotrzebnie
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(KatalogKsiazkiServiceApplication.class, args);
	}

}
