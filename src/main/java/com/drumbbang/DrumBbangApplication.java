package com.drumbbang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DrumBbangApplication {
	public static void main(String[] args) {
		SpringApplication.run(DrumBbangApplication.class, args);
	}
}
