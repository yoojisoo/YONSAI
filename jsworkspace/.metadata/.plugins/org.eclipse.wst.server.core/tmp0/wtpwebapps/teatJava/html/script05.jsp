<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정답보기</title>
<script src="../js/jquery-3.6.0.js"></script> <!--제이쿼리라이브러리-->
<script>
	var count1=0;
	$(document).ready(function(){
		$("ans").hide();
		$("button.q1").click(function(){
			count1++;
				if(count1%2==1){
					$("ans.q1").show();
					$("button.q1").text("정답숨기기");
					$("button.q1").css({"color":"red"});									
					
				}else{
					$("ans.q1").hide();
					$("button.q1").text("정답보기");
					$("button.q1").css({"color":"black"});									
				}
		});
		$("p.q2").click(function(){
				$("ans.q2").toggle();
		});
	});
</script>
</head>
<body>
	<h2>질문1 : 대한민국의 수도는 어디입니까?</h2>
		<button class="q1">정답보기</button><br>
		<ans class="q1">대한민국의 수도는 서울입니다.</ans>
		
		
	<h2>질문2 : 대한민국의 국보1호는 무엇입니까?</h2>
		<p class="q2">[정답보기]</p>
		<ans class="q2">대한민국의 국보1호는 숭례문입니다.</ans>
</body>
</html>