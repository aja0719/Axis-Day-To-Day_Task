package com.axis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HelloController {

		// TODO Auto-generated method stub
		@GetMapping("/message")
      public String displayMessage() {
			
			return "Welcome to the Springs RestFul WebServices";
		}
	}

