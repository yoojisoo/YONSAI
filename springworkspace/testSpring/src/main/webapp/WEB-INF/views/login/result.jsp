<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인정보받기</title>

</head>
<body>
	<h1>로그인 정보 응답</h1>
	아이디 : ${userID } <br>
	이름 : ${userName } <br>
	<hr>
	아이디 : ${info.userID } <br>
	이름 : ${info.userName } <br>
	<hr>
	아이디 : ${loginvo.userID } <br>
	이름 : ${loginvo.userName }
</body>
</html>