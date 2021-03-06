<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="java.sql.*" %>
    

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Dashboard - SB Admin</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed">
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <jsp:include page="include/top.jsp"></jsp:include>
<%--             <%@include file="" %> 이렇게 쓸수도 있음, 골뱅이붙은 파일은 '설정'         --%>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <jsp:include page="include/nav.jsp"></jsp:include>
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Dashboard2</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Dashboard3</li>
                        </ol>
                        <div class="row">
                        	content : 데이터 베이스 연결하는곳 <br>
                        	<%
                        	Connection conn=null;
                        	try{
                        		String url="jdbc:mysql://localhost:3306/jdbctest?serverTimezone=UTC";
                        		String user="root";
                        		String password="123456";
                        		
                        		Class.forName("com.mysql.cj.jdbc.Driver");
                        		conn = DriverManager.getConnection(url, user, password);
                        		out.println("DB연결 완료되었습니다.");

                        		
                        	}catch(SQLException sqle){
                        		out.println("DB연결 실패했습니다.");
                        		
                        	}finally{
                        		if(conn != null)
                        			conn.close();
                        	}
                        	
                        	
                        	%>
                        	
                        	
                        </div>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <jsp:include page="include/foot.jsp" />
                </footer>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="assets/demo/chart-area-demo.js"></script>
        <script src="assets/demo/chart-bar-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="js/datatables-simple-demo.js"></script>
    </body>
</html>
    