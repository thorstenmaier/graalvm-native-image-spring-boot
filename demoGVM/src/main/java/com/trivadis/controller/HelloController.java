package com.trivadis.controller;

import org.springframework.stereotype.Component;

//@RestController
@Component
public class HelloController {

//	@GetMapping("/")
	public String hello() {
		return "Hello GraalVm ...!";
	}

//	@GetMapping("/install")
	public String installGraal() {
		return "here can you click in roder to install..!";
	}
}
