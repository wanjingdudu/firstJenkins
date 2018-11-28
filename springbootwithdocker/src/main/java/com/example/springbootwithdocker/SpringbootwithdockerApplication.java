package com.example.springbootwithdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootwithdockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithdockerApplication.class, args);
	}


	@RequestMapping("/")
	public String testDemo(){
		return "Hello Sprongboot With Docker  ";
	}
}

