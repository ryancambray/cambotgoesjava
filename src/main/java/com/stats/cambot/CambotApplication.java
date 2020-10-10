package com.stats.cambot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CambotApplication {
	
	final static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		SpringApplication.run(CambotApplication.class, args);
	}

}
