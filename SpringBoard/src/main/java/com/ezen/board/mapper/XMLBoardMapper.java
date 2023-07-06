package com.ezen.board.mapper;

import com.ezen.board.dto.BoardDTO;

public interface XMLBoardMapper {

	public BoardDTO getBoard(int board_id);
	
	public int updateBoard(BoardDTO board);
	
}
