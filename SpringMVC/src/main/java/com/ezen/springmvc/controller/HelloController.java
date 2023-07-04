package com.ezen.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.springmvc.model.Survey;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class HelloController {
	
	@RequestMapping(value = {"/hello", "/hi"}, method = {RequestMethod.GET, RequestMethod.POST})
	String hello(HttpSession session) {

		log.fatal("접속했습니다~");
		log.fatal(session.getId());
		
		return "hello";
	}
	
	@RequestMapping(value = "/survey/", method = RequestMethod.GET)
	String survey() {
		return "survey/form";
	}
	
	// 해당 컨트롤러에서 필요한 것을 메서드의 인자에 정의해 두면 알아서 채워준다
	@PostMapping("/survey")
	String addSurvey(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String name = request.getParameter("name"); 
		String age = request.getParameter("age"); 
		
		log.error("name: "  + name);
		log.error("age: " + age);

		if(name == null || age == null ||
				name.trim().equals("") || age.trim().equals("")) {
			response.sendRedirect(request.getContextPath() + "/");
			return null;
		}
		
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		
		return "survey/result";
	}
	
	@PostMapping("/survey/2")
	String addSurvey2(Survey survey) {
		// 모델 클래스를 메소드의 인자로 설정해두면 
		// 파라미터로부터 받은 데이터를 자동으로 바인딩해준다 (알아서 채워줌)
		// form에 설정한 name 속성값과 모델 클래스(dto, vo)의 변수명이 일치해야
		// 바인딩이 가능하다
		log.error(survey);
		
		// 바인딩이 성공하는 경우 해당 인스턴스는 어트리뷰트에 자동으로 추가된다
		
		return "survey/result2";
	}

	@RequestMapping(value="/survey/3", method=RequestMethod.POST)
	String addSurvey3(@ModelAttribute("name") String name, @ModelAttribute("age") Integer age) {
		log.error("name : " + name);
		log.error("age : " + age);
		
		return "survey/result3";
	}

	@GetMapping("/test/abc")
	void index() {}
	
}
