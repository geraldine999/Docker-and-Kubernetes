package com.example.hello;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloApplicationTests {

	Logger logger = LoggerFactory.getLogger(HelloApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("💜 Executing test...");
		assertEquals(true, true);
		logger.info("💜 Test executed");
	}

}
