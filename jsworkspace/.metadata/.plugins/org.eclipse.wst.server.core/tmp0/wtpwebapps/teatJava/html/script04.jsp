<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제이쿼리2</title>
<script src="../js/jquery-3.6.0.js"></script> <!--제이쿼리라이브러리-->
<script>
	var n=0;
	$(document).ready(function(){
		$("div.out").mouseenter(function(){
			$("div.out").css("background-color","lightyellow");
			$("p:first",this).text("마우스 포인트 들어옴"); //this가 있을수도 있다...
			$("p:last",this).text(++n);
		});
		$("div.out").mouseleave(function(){
			$("div.out").css("background-color","lightgreen");
			$("p:first").text("마우스 포인트 나감");
			$("p:last").text("최종횟수 :" + n);			
		});
	});
</script>
<style>
	div.out{ <!--기본세팅-->
		width : 200px;
		height : 100px;
		border : 1px solid #000000;
		text-align : center;
		background-color : lightyellow;
	}

</style>

</head>
<body>
	<div class="out">
		<p>마우스 이벤트 알아보기</p>
		<p>0</p>
	</div>
</body>
</html>