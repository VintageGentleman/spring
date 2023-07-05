<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<div id="post_list">
	<div class="listRow">
		<div>번호</div>
		<div>제목</div>
		<div>글쓴이</div>
		<div>조회수</div>
	</div>
	<c:forEach items="${boardList}" var="board">
	<div class="listRow listItem">
		<div>
			${board.board_id}
		</div>
		<div>
			${board.board_title}
		</div>
		<div>
			${board.writer}
		</div>
		<div>
			${board.board_view}
		</div>
	</div>
	</c:forEach>
</div>