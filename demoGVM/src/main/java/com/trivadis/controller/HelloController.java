package com.trivadis.controller;

//@RestController
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
