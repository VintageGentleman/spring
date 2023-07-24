<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select</title>
</head>
<body>
	<c:forEach items="${list}" var="emp">
		<div>
			id = ${emp.emp_id} <br>
			first_name = ${emp.first_name} <br>
			last_name = ${emp.last_name} <br>
			salary = ${emp.salary}
		</div>
	</c:forEach>
</body>
</html>