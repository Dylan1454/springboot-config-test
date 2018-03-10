package com.dylan.springbootconfigtest;

import com.dylan.springbootconfigtest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootConfigTestApplication {

	@Autowired
	private TestService testService;

	@GetMapping("/1")
	public String sayHello1(){
		return "sayHello1 "+ testService.sayHello();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigTestApplication.class, args);
	}
}
