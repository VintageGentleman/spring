package com.ezen.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.springrest.mapper.EmployeeMapper;

import dto.Employee;

@RequestMapping("/test")
@Controller
public class TestController {

	@Autowired
	EmployeeMapper mapper;
	
	@GetMapping("/")
	String home() {
		return "/test/test";
	}
	
	@GetMapping("/select")
	String select(Model model) {
		model.addAttribute("list", mapper.select());
		return "/test/select";
	}
	
	@GetMapping("/insert")
	String toInsert() {
		return "/test/insert";
	}
	
	@PostMapping("/insert")
	String insert(Employee emp) {
		mapper.insert(emp);
		return "redirect:/test/";
	}
	
	@GetMapping("/update")
	String toUpdate() {
		return "/test/update";
	}
	
	@PostMapping("/update")
	String update(Employee emp) {
		mapper.update(emp);
		return "redirect:/test/";
	}
	
	@GetMapping("/delete")
	String toDelete() {
		return "/test/delete";
	}
	
	@PostMapping("/delete")
	String delete(int emp_id) {
		mapper.delete(emp_id);
		return "redirect:/test/";
	}
	
}
