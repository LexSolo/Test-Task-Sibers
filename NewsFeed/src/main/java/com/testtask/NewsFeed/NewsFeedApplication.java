package com.testtask.NewsFeed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class of the Spring Boot application to start with.
 *
 * @author Aleksandr Solovev.
 * */

// annotation marks class as an entry point of the app
@SpringBootApplication
public class NewsFeedApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsFeedApplication.class, args);
	}

}
