<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스타일 적용하기</title>
<script src="../js/jquery-3.6.0.js"></script> <!--제이쿼리라이브러리-->
	<script>
		 $(document).ready(function(){
			 $("button.remove").click(function(){
				$("h1, h2, p").removeClass("blue");
				$("div").removeClass("important");
			 });
			 
			 $("button.add").click(function(){
				$("h1, h2, p").addClass("blue");
				$("div").addClass("important");
			 });
			 
			 $("button.tog").click(function(){
				$("h1, h2, p, div").toggleClass("red");
			 });
			 
		 });
	</script>
	
<style>
	.red{
		color: red;
		border: 1px solid blue;
	}
	.important{
		font-weight: bold;
	}
	.blue{
		color: blue;
	}
</style>
		
</head>
<body>
	<h1>HTML5</h1>
	<h2>CSS3</h2>
	<p>자바스크립트</p>
	<div>제이쿼리</div><br>
	<button class="tog">CSS 적용/해제</button>
	<button class="add">CSS 적용</button>
	<button class="remove">CSS 적용 해체</button>
</body>
</html>