<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
전송받은 내용
<%
//request객체 중요!
// request.setCharacterEncoding("utf-8"); //날라왔을때 한글깨질때 쓰는 것
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	
	out.println("전송 받은 문자열 출력<br>");
	out.println("이름 - " + name + "<br>");
	out.println("나이 - " + age + "<br>");
%>
<hr>
<%-- 주석:▼표현식 --%>
이름 : <%=name %><br>
나이 : <%=age %><br>
<hr>
</body>
</html>