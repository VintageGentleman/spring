package com.ezen.springdatabase;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.springdatabase.common.Pagination;
import com.ezen.springdatabase.dto.BoardDTO;
import com.ezen.springdatabase.mapper.BoardMapper;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@Autowired
	BoardMapper dao;
	
	@GetMapping("/board/list")
	public String list(int page, Model model) {
		
		List<BoardDTO> boardList;
		
		Pagination paging = new Pagination(dao.getTotalPostCount());
		
		model.addAttribute("paging", paging);

		if(page == 1) {
			boardList = dao.getPage(1, 10);
			paging.setCurrPage(1);
		} else {
			boardList = dao.getPage((page - 1) * 10 + 1, page * 10);
			paging.setCurrPage(page);
		}

		model.addAttribute("boardList", boardList);
		model.addAttribute("pageList", paging.getPageList());
		
		return "/board/list";
	}
	
}
