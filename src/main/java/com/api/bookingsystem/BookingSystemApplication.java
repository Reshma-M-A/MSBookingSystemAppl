package com.api.bookingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={
		"com.api.bookingsystem.config", "com.api.bookingsystem.controllers", "com.api.bookingsystem.dao", "com.api.bookingsystem.handler",
		"com.api.bookingsystem.model", "com.api.bookingsystem.service"})
public class BookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingSystemApplication.class, args);
	}
}
