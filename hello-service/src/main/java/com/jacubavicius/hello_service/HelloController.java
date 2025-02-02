package com.jacubavicius.hello_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	private final NameServiceClient nameServiceClient;	
	
	
	public HelloController(NameServiceClient nameServiceClient) {
		this.nameServiceClient = nameServiceClient;
	}

	@GetMapping("/name")
	void helloName() {
		System.out.println("Hello, " + nameServiceClient.name() + "!");
	}
}
