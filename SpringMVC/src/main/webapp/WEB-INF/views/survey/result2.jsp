<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>설문결과</title>
</head>
<body>

	<h3>자동 바인딩 객체 출력해보기</h3>
	
	<p>컨트롤러에서 바인딩이 성공적으로 진행된다면 자동으로 어트리뷰트에도 추가해준다</p>
	
	<p>${survey}</p>
	
	<button onclick="location.href='./'">이전</button>
	
</body>
</html>