<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>

</head>
<body>
	<h1>회원가입</h1>
	<br>
	<%
	request.setCharacterEncoding("UTF-8");

	LocalDate now = LocalDate.now();
	int year = now.getYear();
	int month = now.getMonthValue();
	int day = now.getDayOfMonth();
	int i =0;%>
	
		<form action="joinOK.jsp" method="post">
			<p>아이디 <input type="text" name="id" " required></p>
			<p>비밀번호 <input type="password" name="pw1" required></p>
			<p>비밀번호 확인 <input type="password" name="pw2" placeholder="똑같이 써요~~" autofocus required></p>
			<p>이름 <input type="text" name="name"></p>
			<p>핸드폰번호 <input type="text" name="phone" required></p>
			<p>메일주소 <input type="mail" name="mail"></p>
			
			<select name = "year">
			<%for(i=1910; i<=year; i++){ %>
				<option value="<%=i%>"> <%=i %> </option>		
			<%}%>
			</select>년
				
			<select name = "month">
			<%for(i=1; i<=12; i++){ %>
				<option value="<%=i%>"> <%=i %> </option>		
			<%}%>
			</select>월
				
			<select name = "day">
			<%for(i=1; i<=31; i++){ %>
				<option value="<%=i%>"> <%=i %> </option>		
			<%}%>
			</select>일
			
			<P><input type="submit" value="완료"></P>
		</form>	

</body>
</html>