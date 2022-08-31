package com.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.Practice")
public class ConsumeRestFulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeRestFulWebServiceApplication.class, args);
	}

}
