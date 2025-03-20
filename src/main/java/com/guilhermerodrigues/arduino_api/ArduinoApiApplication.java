package com.guilhermerodrigues.arduino_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ArduinoApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArduinoApiApplication.class, args);
	}
}
