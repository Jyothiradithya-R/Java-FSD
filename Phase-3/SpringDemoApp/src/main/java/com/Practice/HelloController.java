package com.Practice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/testme")
	public String hello() {
		return "Hello Jyothiradithya ! Welcome to SpringBoot";
	}

}