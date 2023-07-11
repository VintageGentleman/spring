package com.ezen.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ezen.springrest.dto.EmployeeDTO;
import com.ezen.springrest.service.EmployeeEventService;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/employee")
@Controller
public class EmployeeController {

	@Autowired
	EmployeeEventService eeService;
	
	@GetMapping("/event")
	public void event(Model model) { 
		model.addAttribute("employees", eeService.initEventPage()); 
	}
	
	// @ResponseBody : @Controller 내부에서 REST방식으로 응답할 때 사용한다
	@ResponseBody
	@GetMapping(value="/roll", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeDTO> roll() {
		return eeService.getRandomEmployees(10);
	}
	
	@GetMapping("/add")
	public String addPage() {
		return "employee/addEmp";
	}
	
	@ResponseBody
	@PostMapping("/add")
	public ResponseEntity<EmployeeDTO> add(@RequestBody EmployeeDTO emp) {
		// Ajax 요청으로 도착한 데이터를 활용할 수 있다
		log.info("post! : " + emp);
		return null;
	}

	// GET - select
	// POST - insert
	// PUT - update
	// DELETE - delete
	
	@ResponseBody
	@PutMapping("/put/{employee_id}")
	public ResponseEntity<String> put(@PathVariable("employee_id") Integer emp_id, @RequestBody EmployeeDTO emp) {
		
		log.info("path에서 받은 id: " + emp_id);
		log.info(emp);
		
		// id로 해당 데이터가 존재하는지 여부를 체크 (원래는 DB에서 조회를 통해 체크해야함)
		if(emp_id > 100 && emp_id < 200) {
			// id가 있는 경우
			return ResponseEntity.ok()
					.contentType(MediaType.parseMediaType("text/plain;charset=UTF-8"))
					.body("사원 정보가 성공적으로 수정되었습니다.");
		} else {
			// id가 없는 경우 상태코드 400으로 응답
			return ResponseEntity.badRequest()
					.contentType(MediaType.parseMediaType("text/plain;charset=UTF-8"))
					.body("없는 사원 번호입니다.");
		}
		
	}
}
