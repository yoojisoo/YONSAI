<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }" /> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>굿즈폼^^</title>
</head>
<body>

	<form action="${contextPath }/goods/goodForm" method = GET >
		상품명 : <input type="text" name="name"><br>
		가격 : <input type="text" name="price"><br>
		제조일 : <input type="text" name="makeDate"><br>
		<input type="submit" value = "완료">
	</form> 
	
	<p>${str }</p>

</body>
</html>