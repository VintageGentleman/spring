package com.ezen.springdatabase.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ezen.springdatabase.dto.BoardDTO;
import com.ezen.springdatabase.dto.EmployeeDTO;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MybatisTest {
	
	@Autowired
	EmployeeMapper emp_mapper;
	
	@Autowired
	BoardMapper board_mapper;
	
	@Ignore
	@Test
	public void test() {
		for(EmployeeDTO emp : emp_mapper.getAll()) {
			log.info(emp);
		};
	}
	
	@Ignore
	@Test
	public void test2() {
		for(EmployeeDTO emp : emp_mapper.getAll2()) {
			log.info(emp);
		};
	}
	
	@Ignore
	@Test
	public void insertTest() {
		BoardDTO board = new BoardDTO();
		
		board.setBoard_content("내용");
		board.setBoard_pw("1234");
		board.setBoard_title("테스트용 제목");
		board.setWriter("글쓴이");
		
		assertTrue(board_mapper.add(board) > 0);
	}
	
	@Ignore
	@Test
	public void test3() {
		for(BoardDTO board : board_mapper.getPage(1, 5)) {
			log.info(board);
		};
	}
	
	@Ignore
	@Test
	public void test4() {
		assertEquals(1, board_mapper.deletePage(1));
	}
	
	@Test
	public void test5() {
		log.error(board_mapper.getTotalPostCount());
	}
	
	
}
