package com.ezen.board.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDTO {
	private Integer board_id;
	private String writer;
	private String board_pw;
	private String board_title;
	private String board_content;
	private Integer board_view;
	private Date write_date;
}
