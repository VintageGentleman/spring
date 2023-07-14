package com.ezen.springrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/commons/")
@Controller
public class HomeController {
	
	@GetMapping("/")
	String index() {
		return "commons/index";
	}
	
}
