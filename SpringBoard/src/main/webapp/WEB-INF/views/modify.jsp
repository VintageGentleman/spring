<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>글 수정 페이지</title>
</head>
<body>

	<form action="./modify" method="POST">
		<input type="hidden" name="board_id" value="${board.board_id}">
		<input type="hidden" name="writer" value="${board.writer}">
		글 제목 수정 : <input type="text" name="board_title" value="${board.board_title}"/> <br>
		글 내용 수정 : <br>
		<textarea name="board_content">${board.board_content}</textarea> <br>
		글쓴이 : ${board.writer} <br>
		비밀번호 : <input name="board_pw" type="password"/> <br>
		<input type="submit" value="수정하기"/>
	</form>
	
</body>
</html>