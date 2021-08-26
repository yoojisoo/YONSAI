<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스타일 시트 적용</title>

<%
/*
   * -> 전체 선택자
   # -> id 선택자 : 문서내에서 1회 사용가능(보통 헤더에서 사용) identify
   . -> class 선택자 : 
   table,td,p,body -> 일반 선택자
   
*/
%>
<style>
<!--
이것은 인라인 스타일 -->p {
   color: blue;
}
.shin {
   color: red;
   background-color: green;
}
.change2{
   color: blue;
}
#mun{
   color:pink;
}
#box1{
   background-color: green;
   margin-left: 10px;
}
#box2{
   background-color: red;
   padding-left: 100px;
}
</style>
</head>
<body>
   <h1>스타일 적용방법 3가지</h1>
   <p>스타일 적용 1</p>
   <p class="shin">스타일 적용 2</p>
   <!-- 12번째 줄에 추가한 .shin 을 했다. .shin은 class이름이다. -->
   <p id = "mun">스타일 적용 3</p> <!-- 문서내에 한번만 사용할때는 id를 사용한다. -->
   <hr> <!-- hr 은 줄 한줄 표시 -->
   <h1 class="change2">스타일 적용 2</h1>
   <p>스타일 적용1</p>
   
   <div id="box1">100*100<br/> margin-left</div>
   <div id="box2">100*100<br/> padding-left</div>
   
   
   
</body>
</html>