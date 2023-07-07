package com.ezen.board.mapper;

import org.apache.ibatis.annotations.Param;

import com.ezen.board.dto.BoardDTO;

public interface BoardMapper2 {

	BoardDTO get(@Param("id") int id);
	
	int update(BoardDTO board);
	
}
