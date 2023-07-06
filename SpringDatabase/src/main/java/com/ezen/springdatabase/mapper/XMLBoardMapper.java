package com.ezen.springdatabase.mapper;

import java.util.List;

import com.ezen.springdatabase.dto.BoardDTO;

public interface XMLBoardMapper {

	List<BoardDTO> getAll();
	
	int add(BoardDTO board);
	
}
