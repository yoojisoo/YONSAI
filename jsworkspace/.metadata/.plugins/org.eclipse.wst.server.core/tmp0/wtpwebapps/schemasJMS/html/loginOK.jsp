<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@ include file="dbConn.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인OK</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String id = (String)request.getParameter("id");
	String pw = (String)request.getParameter("pw");


	PreparedStatement pstmt=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	try{
		
	String sql="select * from `schemajms`.`join`"; //안되면 where 넣기
	pstmt = conn.prepareStatement(sql);
	stmt = conn.createStatement();
	rs = pstmt.executeQuery();
	
	while(rs.next()){
		if(rs.getString(2).equals(id) && rs.getString(3).equals(pw)){
			String name = rs.getString(4);
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
			session.setAttribute("name", name);
	%>
	<script>
		alert("로그인 성공");
		location.href="boardView.jsp";
	</script>
	<%
		}//if
	}//while
	
	
	%>
	<script>
		alert("로그인 실패");
		location.href="loginForm.jsp";
	</script>

	<%
	}catch(SQLException sql){
		sql.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(conn != null){
		conn.close();	
		}
		if(stmt != null){
		conn.close();	
		}
	}
	%>				

</body>
</html>