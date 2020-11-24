package com.pirani.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsDemoApplication {

	@GetMapping(path = "/", produces = "application/json")
	public String index(){
		return "{\"message\": \"Hello world!\"}";
	}
	@GetMapping(path = "/unitTest", produces = "application/json")
	public String unitTest(){
		return "{\"unitTest\": \"Success!\"}";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoApplication.class, args);
	}

}
