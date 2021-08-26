<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전송 폼 예제</title>
</head>
<body>
	<h1>전송하기 예제</h1>
	텍스트, 체크박스, 레디오박스, 리스트, 텍스트영역, 버튼<br>
	<form action="testOK.jsp" method="get">
		이름 : <input type="text" name="name" id="name"><br>
		나이 : <input type="text" name="age" id="age"><br>
		<input type="submit">
		<input type="reset">
	</form>
</body>
</html>