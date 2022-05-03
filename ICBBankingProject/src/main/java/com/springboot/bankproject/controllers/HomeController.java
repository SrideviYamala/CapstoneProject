package com.springboot.bankproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bankproject.util.DateTimeUtilities;

@RestController
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "Hello visitor!\nVisiting time: "+ DateTimeUtilities.getTimeStamp();
	}
}
