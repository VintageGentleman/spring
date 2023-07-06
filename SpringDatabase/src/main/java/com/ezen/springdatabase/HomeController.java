package com.ezen.springdatabase;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.springdatabase.common.Pagination;
import com.ezen.springdatabase.dto.BoardDTO;
import com.ezen.springdatabase.mapper.BoardMapper;
import com.ezen.springdatabase.mapper.XMLBoardMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class HomeController {
	
	@Autowired
	BoardMapper dao;

	@Autowired
	XMLBoardMapper xmlBoardMapper;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	@GetMapping("/board/list")
	public String list(Integer page, Model model) {
		List<BoardDTO> boardList;
		
		Pagination paging = new Pagination(dao.getTotalPostCount());
		
		model.addAttribute("paging", paging);

		if(page == null) {
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
	
	@GetMapping("/board/all")
	public void all() {
		for(BoardDTO board : xmlBoardMapper.getAll()) {
			log.info(board);
		}
	}
	
	@GetMapping("/board/add")
	public void add() {
		BoardDTO board = new BoardDTO();
		
		board.setWriter("XML_Tester");
		board.setBoard_title("XML Test");
		board.setBoard_content("대충 내용");
		board.setBoard_pw("xml");
		
		log.info("결과: " + xmlBoardMapper.add(board));
	}
	
}
