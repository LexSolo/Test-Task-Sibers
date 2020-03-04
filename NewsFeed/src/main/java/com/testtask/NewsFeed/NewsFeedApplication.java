package com.testtask.NewsFeed;

//import com.testtask.NewsFeed.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewsFeedApplication {

	public static void main(String[] args) {
//		SpringApplication.run(new Class[] {NewsFeedApplication.class, JpaConfig.class}, args);
		SpringApplication.run(NewsFeedApplication.class, args);
	}

}
