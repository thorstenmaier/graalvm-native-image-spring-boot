package com.trivadis.controller;

import org.springframework.stereotype.Component;

//@RestController
@Component
public class HelloController {

//	@GetMapping("/")
	public String hello() {
		return "Hello GraalVM!";
	}
}
