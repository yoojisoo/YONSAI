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

	<p>상품명 : ${name }</p>
	<p>가격 : ${price }</p>
	<p>제조일 : ${makeDate }</p>
	
	<p>상품명2 : ${product.name }</p>
	<p>가격2 : ${product.price }</p>
	<p>제조일2 : ${product.makeDate }</p>
	
	<p>상품명3 : ${mgoods.name }</p>
	<p>가격3 : ${mgoods.price }</p>
	<p>제조일3 : ${mgoods.makeDate }</p>
</body>
</html>