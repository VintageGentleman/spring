package com.ezen.springdatabase.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ezen.springdatabase.dto.BoardDTO;

public interface BoardMapper {

	@Select("SELECT * FROM (SELECT rownum AS rn, a.* FROM"
			+ " (SELECT * FROM board ORDER BY board_id DESC) a)"
			+ " WHERE rn BETWEEN #{start} AND #{end}")
	List<BoardDTO> getPage(@Param("start") int rowNumStart, @Param("end") int rowNumEnd);
	
	@Delete("DELETE board WHERE board_id=#{id}")
	int deletePage(@Param("id") int board_id);

	@Insert("INSERT INTO board(board_id, writer, board_pw, board_title, board_content, board_view, write_date)"
			+ " VALUES(board_id_seq.nextval, #{writer}, #{board_pw}, #{board_title}, #{board_content}, 0, sysdate)")
	int add(BoardDTO board);

	@Select("SELECT count(*) FROM board")
	int getTotalPostCount();
	
}
