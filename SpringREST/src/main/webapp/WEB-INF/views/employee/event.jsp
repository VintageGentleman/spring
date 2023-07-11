<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/resources/employee/css/event.css" var="css" />
<c:url value="/resources/employee/js/event.js" var="js1" />
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>이벤트 페이지</title>
	<link rel="stylesheet" href="${css}">
</head>
<body>

	<div id="btns">
		<button id="ajax-btn1" class="btn">AJAX Test1</button>
		<button id="ajax-btn2" class="btn">AJAX Test2 (JSON Data)</button>
		<button id="roll" class="btn">추첨하기</button>
	</div>

	<div id="tBody">	
		<div id="table">
				<div class="header">번호</div>
				<div class="header">이름</div>
				<div class="header">성</div>
				<div class="header">email</div>
				<div class="header">전화번호</div>
				<div class="header">job_id</div>
				<div class="header">salary</div>
				<div class="header">매니저id</div>
				<div class="header">부서id</div>
		</div>
		<div id="user">
			<c:forEach items="${employees}" var="employee">
				<div class="main">${employee.employee_id}</div>
				<div class="main">${employee.first_name}</div>
				<div class="main">${employee.last_name}</div>
				<div class="main">${employee.email}</div>
				<div class="main">${employee.phone_number}</div>
				<div class="main">${employee.job_id}</div>
				<div class="main">${employee.salary}</div>
				<div class="main">${employee.manager_id}</div>
				<div class="main">${employee.department_id}</div>
			</c:forEach>
		</div>
	</div>
	
	<script src="${js1}"></script>
	
</body>
</html>