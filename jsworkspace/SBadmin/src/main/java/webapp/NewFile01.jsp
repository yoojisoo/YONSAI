<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
jstl정리<br>
이동하기<br>
<jsp:forward page="index.jsp"></jsp:forward>
<jsp:useBean id="scan" class="java.util.Scanner"></jsp:useBean>
<!-- Scanner scan = new Scanner(System.in); 위에처럼 아니면 이렇게 -->
<%-- <jsp:getProperty property="" name=""/> 게터 --%>
<%-- <jsp:setProperty property="" name=""/> 세터 --%>
</body>
</html>