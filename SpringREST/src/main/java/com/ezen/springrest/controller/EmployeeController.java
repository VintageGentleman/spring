package com.ezen.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.springrest.service.EmployeeEventService;

@RequestMapping("/employee")
@Controller
public class EmployeeController {

	@Autowired
	EmployeeEventService eeService;
	
	@GetMapping("/event")
	public void event(Model model) { 
		model.addAttribute("employees", eeService.initEventPage()); 
	}
}
