package com.feedbeforeflight.RabbitOne;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@SpringBootApplication
//@PropertySource("application.properties")
public class RabbitOneApplication {

	@Value("${app.version}")
	private String version;

	public static void main(String[] args) {

		SpringApplication.run(RabbitOneApplication.class, args);

		System.out.println("It works!");
		System.out.println("It works!");

	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("SampleApplication started with version: " + version);
	}
}
