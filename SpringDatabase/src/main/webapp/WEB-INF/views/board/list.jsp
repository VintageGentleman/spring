<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/resources/css" var="css"/>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="EUC-KR">
	<title>�Խ��� Ȩ</title>
	<link rel="stylesheet" href="${css}/font.css">
	<link rel="stylesheet" href="${css}/list.css">
</head>
<body>
	<h1>�Խ���</h1>
	<div id="header">
		<button class="btn btn-header" onclick="movePostWrite()">�۾���</button>
	</div>
	<jsp:include page="../list/post_list.jsp" />
	<jsp:include page="../list/page_list.jsp" />
	
</body>
</html>