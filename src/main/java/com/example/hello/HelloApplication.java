package com.example.hello;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	public static Logger logger = LoggerFactory.getLogger(HelloApplication.class);

	@PostConstruct
	public static void init(){
		logger.info("💜 Application loading...");
		logger.info("😀");
		logger.info("🎈");
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
		logger.info("💜 Application executed.");
	}

}
