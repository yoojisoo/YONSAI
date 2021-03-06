<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
    
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
                        	content : 본문내용 구성하는곳 <br>
                        	
                        	<%! //<$!<--선언태그 // <% <--이게 스크립태그(jsp입니다...)
                        	// 스크립태그, 페이지태그, 액션태그, 디렉티브태그
                        	String str = "Hello";
                        	int count=3;
                        	%>
                        	<hr>
                        	<table class="table">
                        	<%
								for(int i=0; i<=count; i++){
									out.println("<tr>");
									out.println("<td>JSP : </td><td>" + i + "</td>");
									out.println("</tr>");
								}
							%>
							</table>
							문자열 출력 : <%=str %><br>
							<c:forEach var="j" begin="1" end="3">
								Item <c:out value="${j}"/><p>
							</c:forEach>
							<hr>
							Today is : <%= new java.util.Date() %><br>
							<jsp:useBean id="date" class="java.util.Date" />
							오늘의 날짜 및 시각 : <%=date %>
							<hr>
							<jsp:useBean id="st" class="api.Student" scope="request"></jsp:useBean>
							아이디 : <jsp:getProperty property="no" name="st"/><br>
							이름 : <jsp:getProperty property="name" name="st"/><br>
							
							아이디 : <%=st.getNo() %><br>
							이름 : <%=st.getName() %><br>
							
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
    