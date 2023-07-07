package com.ezen.board;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.board.dto.BoardDTO;
import com.ezen.board.mapper.BoardMapper;
import com.ezen.board.mapper.BoardMapper2;
import com.ezen.board.mapper.XMLBoardMapper;
import com.ezen.board.service.BoardService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class HomeController {
	
	@Autowired
	BoardMapper boardMapper;
	@Autowired
	XMLBoardMapper xmlBoardMapper;
	@Autowired
	BoardMapper2 boardMapper2;
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		log.info("welcome home!");
		
		return "home";
	}
	
	@GetMapping("/list")
	public void list(Integer page, Model model) {
		if(page == null) page = 1;
		
		int size = 10;
		int end = page * size;
		int start = end - (size - 1);
		model.addAttribute("boards", boardMapper.getPage(start, end));
	}
	
	@GetMapping("/list/update")
	public String update(Integer id, Model model) {
		if(id == null) return "redirect:/list";
		
		BoardDTO board = xmlBoardMapper.getBoard(id); 
		
		if(board == null) return "redirect:/list";
		
		model.addAttribute("board", board);
		
		return "update";
	}

	@GetMapping("/list/execute")
	public String execute(String board_title, String board_content, Integer board_id) {
		
		BoardDTO board = new BoardDTO(); 
		
		board.setBoard_id(board_id);
		board.setBoard_title(board_title);
		board.setBoard_content(board_content);
		
		xmlBoardMapper.updateBoard(board);
		
		return "redirect:/list";
	}
	
	@GetMapping("/modify")
	public void modifyForm(int id, Model model) {
		log.info("id: " + id);
		model.addAttribute("board", boardMapper2.get(id));
	}
	
	@PostMapping("/modify")
	public String modifyProcess(BoardDTO board) {
		if(boardService.updateBoard(board)) {
			return "redirect:modify?id=" + board.getBoard_id();
		} else {
			return "redirect:list?page=1";
		}
	}
	
}
