package com.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringSecurityAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAuthenticationApplication.class, args);
	}

}
