<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="../js/jquery-3.6.0.js"></script>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>
	<h1>login</h1>
	<hr>
		<form action="loginOK.jsp" method="post">
			<p>아이디 <input type="text" name="id"></p>
			<p>비밀번호 <input type="password" name="pw"></p>
			<P><input type="submit" value="확인"></P>
		</form>
		
</body>
</html>