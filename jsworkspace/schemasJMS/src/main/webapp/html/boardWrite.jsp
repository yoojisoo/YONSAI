<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ include file="dbConn.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ㅎㅎ게시판글쓰기~</title>

<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

</head>
<body>

	<%
	request.setCharacterEncoding("UTF-8");
	String id = (String)session.getAttribute("id");
	String pw = (String)session.getAttribute("pw");
	String name = (String)session.getAttribute("name");
	%>
	

<form action = "boardView.jsp" method="post">
   <table style="border: 1px solid #dddddd"; cellspacing=0 cellpadding=0>
<!--    <table border="1" cellspacing=0 cellpadding=0> -->
      <tr>
         <td width="10%" align="center">글쓴이</td>
         <td width="60%"></td>
      </tr>
      <tr>
         <td align="center"></td>
         <td></td>
      </tr>
      <tr>
         <td align="center" style="border: 0px">제목</td>
         
         <td><input type="text" name="subject" style="..." value="${board.subject}"></td>
      </tr>
      <tr>
         <td align="center">내용</td>
         <td><textarea name="content" style="width:95%;height:200px">${board.content}</textarea></td>
      </tr>
      <tr>
         <td colspan="3" align="center">
            <input type="submit" value="글수정">
            <input type="submit" value="글목록" onclick="window.location='script05.jsp'">
         </td>
      </tr>
   </table>
</form>
	

</body>
</html>