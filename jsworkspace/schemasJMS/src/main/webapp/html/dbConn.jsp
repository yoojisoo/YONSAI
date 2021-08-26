<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서버연결</title>
</head>
<body>
	<%
	Connection conn = null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost/schemajms?serverTimezone=UTC";
		String id = "root";
		String pw = "123456";
		
		conn = DriverManager.getConnection(url, id, pw);
// 		out.println("DB OK");
		

	}catch(ClassNotFoundException cnf){
		cnf.printStackTrace();
	}catch(SQLException sql){
		sql.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}
	%>
</body>
</html>