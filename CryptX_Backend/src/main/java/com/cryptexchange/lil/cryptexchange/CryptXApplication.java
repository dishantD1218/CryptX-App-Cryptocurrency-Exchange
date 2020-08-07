package com.cryptexchange.lil.cryptexchange;

import com.cryptexchange.lil.cryptexchange.RestService.BitcoinRestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CryptXApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptXApplication.class, args);


	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
