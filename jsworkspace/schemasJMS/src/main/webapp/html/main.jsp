<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

	.parent {
    display: table-cell; 
    vertical-align: middle;
	}
	
</style>
</head>
<body>

	<div class="parent" style="width: 50%; height: 500px; background: lightyellow;" ><center>
		<h1 style="color:green">안녕 원하는곳으로 이동해^^</h1>
	 	<button onclick="location='loginForm.jsp'" >로그인</button>&nbsp;&nbsp;
	 	<button onclick="location='joinForm.jsp'" style="margin-top:5px">회원가입</button>
    </div>
    </center>

 	
</body>
</html>