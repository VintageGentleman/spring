<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/resources/css/" var="css" />
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>이벤트 페이지</title>
	<link rel="stylesheet" href="${css}event.css">
</head>
<body>
	<button id="btn">버튼</button>
	<div id="table">
		<div class="header">employee_id</div>
		<div class="header">first_name</div>
		<div class="header">last_name</div>
		<div class="header">email</div>
		<div class="header">phone_number</div>
		<div class="header">job_id</div>
		<div class="header">salary</div>
		<div class="header">manager_id</div>
		<div class="header">department_id</div>
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
</body>
</html>