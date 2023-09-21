package com.example.Aucison_Shipping_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // JPA Auditing 활성화(Spring Data JPA에서 시간에 대해서 자동으로 값을 넣어주는 기능)
@EnableFeignClients
public class AucisonShippingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AucisonShippingServiceApplication.class, args);
	}

}
