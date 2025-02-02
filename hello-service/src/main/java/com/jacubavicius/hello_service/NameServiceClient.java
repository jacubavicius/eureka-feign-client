package com.jacubavicius.hello_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "name-service")
public interface NameServiceClient {

	@GetMapping("/name")
	String name();
}
