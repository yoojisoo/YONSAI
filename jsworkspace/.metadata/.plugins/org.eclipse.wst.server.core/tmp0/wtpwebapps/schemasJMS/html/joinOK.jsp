<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "java.sql.*" %>
<%@ include file="dbConn.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
	request.setCharacterEncoding("UTF-8");

	String id = (String)request.getParameter("id");
	String pw1 = (String)request.getParameter("pw1");
	String pw2 = (String)request.getParameter("pw2");
	String name = (String)request.getParameter("name");
	String phon = (String)request.getParameter("phon");
	String mail = (String)request.getParameter("mail");
	String year = (String)request.getParameter("year");
	String month = (String)request.getParameter("month");
	String day = (String)request.getParameter("day");
	
	if(!pw1.equals(pw2)){
	%>
	<script>
// 		alert("비밀번호가 일치하지 않습니다.");
		console.log("비번틀림~~");
		location.href="joinForm.jsp";
	</script>
	<%
	} else{

		String birth = year + month + day;

		//db저장해볼까~~~??
		PreparedStatement pstmt=null;
		Resultset rs=null;
	
		try{
			String sql = "INSERT INTO `schemajms`.`join` (`id`, `pw`, `name`, `phon`, `mail`, `birth`, `etc`) VALUES(?,?,?,?,?,?,?) ";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw1);
			pstmt.setString(3, name);
			pstmt.setString(4, phon);
			pstmt.setString(5, mail);
			pstmt.setString(6, birth);
			pstmt.setString(7, null);
			pstmt.execute();
			
	// 		out.println("회원가입 성공");
		%>
		
			<script>
				alert("회원가입 성공");
		        location.href="board.jsp";
			</script>
		
		<%
		}catch(SQLException sql){
			sql.printStackTrace();
		}finally{
			if(conn != null){
				conn.close();	
			}
			if(pstmt != null){
				conn.close();	
			}
		}
	}//if
		%>
		
	
</body>
</html>