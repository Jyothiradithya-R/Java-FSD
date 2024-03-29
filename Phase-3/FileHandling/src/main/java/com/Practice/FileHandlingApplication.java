package com.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.Practice")
public class FileHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileHandlingApplication.class, args);
	}

}
