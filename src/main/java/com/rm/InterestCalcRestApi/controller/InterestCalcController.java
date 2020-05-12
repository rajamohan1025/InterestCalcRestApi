package com.rm.InterestCalcRestApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterestCalcController {
	
	@GetMapping("/healthCheck")
	public String healthCheck() {
		return "OK";
	}

}
