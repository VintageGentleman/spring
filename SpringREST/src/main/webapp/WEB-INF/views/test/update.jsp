<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<form action="./update" method="POST">
		id = <input name="emp_id" type="text" /> <br>
		first_name = <input name="first_name" type="text" /> <br>
		last_name = <input name="last_name" type="text" /> <br>
		salary = <input name="salary" type="text" /> <br>
		<button>Update</button>
	</form>
</body>
</html>