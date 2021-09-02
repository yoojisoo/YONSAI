<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판보기</title>

<style>


</style>


</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!-- <table class="table table-striped"> -->
<!-- 	<tr> -->
<!-- 		<th>작성자</th> -->
<!-- 		<th>목록</th> -->
<!-- 	</tr> -->
<!-- 	<tr> -->
<!-- 		<td>게시글작성자</td> -->
<!-- 		<td>게시글제목</td> -->
<!-- 	</tr> -->
<!-- 	<tr> -->
<!-- 		<td>게시글작성자</td> -->
<!-- 		<td>게시글제목</td> -->
<!-- 	</tr> -->
<!-- 	<tr> -->
<!-- 		<td>게시글작성자</td> -->
<!-- 		<td>게시글제목</td> -->
<!-- 	</tr> -->
<!-- </table> -->

<h1>Background Color</h1>

<table class="table table-striped">
  <thead>
    <tr class="active">
      <th>Product</th>
      <th>Price</th>
      <th>Quantity</th>
      <th>Sales</th>
    </tr>
  </thead>
  <tbody>
    <tr class="success">
      <td>Notebook</td>
      <td>1,000,000</td>
      <td>5</td>
      <td>5,000,000</td>
    </tr>
    <tr class="info">
      <td>Tablet</td>
      <td>500,000</td>
      <td>6</td>
      <td>3,000,000</td>
    </tr>
    <tr>
      <td class="warning">Monitor</td>
      <td class="danger">300,000</td>
      <td class="warning">10</td>
      <td class="danger">3,000,000</td>
    </tr>
  </tbody>
</table>

</body>
</html>
</body>
</html>