package com.ezen.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.board.dto.BoardDTO;
import com.ezen.board.mapper.BoardMapper2;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper2 boardMapper2;
	
	@Override
	public boolean updateBoard(BoardDTO userBoard) {
		// DB에서 비밀번호를 가져와 조회
		BoardDTO board = boardMapper2.get(userBoard.getBoard_id());
		
		if(userBoard.getBoard_pw().equals(board.getBoard_pw())) {
			// 맞으면 글 수정
			boardMapper2.update(userBoard);
			return true;
		} else {
			// 틀리면 글 수정 안함
			return false;
		}
	}

}
