<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>설문조사 양식</title>
</head>
<body>


<h3>설 문 조 사</h3>

<form action="./" method="POST">
	당신의 이름은 무엇입니까? <br>
	<input type="text" name="name" value="김철수"/> <br>
	당신의 나이는 몇 살입니까? <br>
	만 <input type="number" name="age" value="17"/>세 <br>
	<input type="submit"/>
</form>

<br>

<h3>설 문 조 사 2</h3>

<form action="./2" method="POST">
	당신의 이름은 무엇입니까? <br>
	<input type="text" name="name" value="김씨"/> <br>
	당신의 나이는 몇 살입니까? <br>
	만 <input type="number" name="age" value="22"/>세 <br>
	<input type="submit"/>
</form>

<br>

<h3>설 문 조 사 3</h3>

<form action="./3" method="POST">
	당신의 이름은 무엇입니까? <br>
	<input type="text" name="name" value="최영희"/> <br>
	당신의 나이는 몇 살입니까? <br>
	만 <input type="number" name="age" value="55"/>세 <br>
	<input type="submit"/>
</form>

</body>
</html>