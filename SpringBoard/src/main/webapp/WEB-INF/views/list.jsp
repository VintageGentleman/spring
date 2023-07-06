<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>게시판</title>
	<style>
		#items {
			display: grid;
			grid-template-columns: repeat(5, 1fr);
			gap-column: 10px;
		}
		#items > div {
			text-align: center;
		}
	</style>
</head>
<body>
	
	<h3>
		<c:if test="${param.page == null}">1</c:if>
		${param.page} 페이지
	</h3>
		
	<div id="items">
		<div>글번호</div>
		<div>글쓴이</div>
		<div>제목</div>
		<div>내용</div>
		<div></div>
	<c:forEach items="${boards}" var="board">
		<div>${board.board_id}</div>
		<div>${board.writer}</div>
		<div>${board.board_title}</div>
		<div>${board.board_content}</div>
		<div>
			<button onclick="location.href='./list/update?id=${board.board_id}';">수정하기</button>
		</div>
	</c:forEach>
	</div>
	
</body>
</html>