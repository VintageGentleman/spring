package com.ezen.springmvc;

import java.util.Date;
import java.util.Locale;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.springmvc.model.Student;

@Controller
public class HomeController {

	// 이 클래스에서 발생하는 로그들을 모두 log4j에 전달하는 객체 
	private static Logger log = LogManager.getLogger(HomeController.class);
	
	@Autowired
	Student student;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		log.info(student);
		log.info("Hello Controller!");

		int sum = 0;
		for(int i = 0; i < 10; ++i) {
			log.debug(String.format("현재 sum은 %d, i는 %d이므로 %d + %d가 되어서 다음에 출력될 값은 %d\n", sum, i, sum, i, sum + i));
			log.info(sum += i);
		}
		
		log.fatal("심각한 오류");
		log.error("에러");
		model.addAttribute("serverTime", new Date());
		
		return "home";
	}
	
}
