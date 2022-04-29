package com.microservicios.bookingmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookingMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingMicroservicesApplication.class, args);
	}

}
