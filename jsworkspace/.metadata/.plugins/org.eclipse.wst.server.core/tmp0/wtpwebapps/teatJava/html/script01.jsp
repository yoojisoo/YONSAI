<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test02</title>

<script src="../js/jquery-3.6.0.js"></script> <!--제이쿼리라이브러리-->
<script>
	$(document).ready(function(){ //문서준비 이벤트 코드
// 		$("p").hide();		
// 		$("#t1").hide();		
// 		$(".c1").hide();	
		$("#h").click(function(){
// 			$("#t1").hide("slow");
			$("#t1").fadeOut("slow"); //점점 사라지기
			$("p").css("color","red");
		});
// 		$("#s").on(~~~)
		$("#s").click(function(){
// 			$("#t1").show("slow");
			$("#t1").fadeIn("slow"); //점점 나타나기
			$("p").css("color","skyblue");
		});
	});
	
	
</script>
</head>
<body>
	<p>1.숨기기 해주세요</p>
	<p id="t1">2.숨기기 해주세요</p>
	<p class="c1">3.숨기기 해주세요</p>
	<button id="h">2.숨기기</button>
	<button id="s">2.보이기</button>
	
	
</body>
</html>