package com.swamy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeRestController {

	@GetMapping
	public String showMessage() {
		return "Welcome to SprinBoot With Prometheus & Graphana..!";
	}
}
