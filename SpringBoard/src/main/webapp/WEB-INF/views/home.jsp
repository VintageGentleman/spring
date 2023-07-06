<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>게시판 보러가기</title>
</head>
<body>
	
	<h3>게시판 연습하기</h3>
	
	<c:forEach begin="1" end="10" var="i">
		<a href="./list?page=${i}">${i}페이지 보러 가기</a> <br>
	</c:forEach>
	 
</body>
</html>