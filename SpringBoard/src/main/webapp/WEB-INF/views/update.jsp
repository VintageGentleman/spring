<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>수정하기</title>
	<style>
		#title {
			width: 500px;
		}
		#content {
			width: 500px;
			height: 500px;
			resize: none;
		}
	</style>
</head>
<body>
	<h3>${board.board_id}번 글 수정하기</h3>	
	<form action="./list/execute" method="POST">
		제목 <br>
		<input id="title" type="text" name="board_title" value="${board.board_title}"/> 
		<br>
		<br>
		내용 <br>
		<textarea id="content" name="board_content">${board.board_content}</textarea> <br>
		<input type="hidden" name="board_id" value="${board.board_id}">
		<input type="submit" value="수정하기"/>
	</form>
</body>
</html>