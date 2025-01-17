package com.ex.lgy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String getMethodName() {
		return "hello docker";
	}
	@GetMapping("/a")
	public String getMethodName2() {
		return "hello docker aa";
	}
	@GetMapping("/b")
	public String getMethodName3() {
		return "hello docker bb";
	}
}
