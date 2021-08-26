<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PPT 5번 예제 연습</title>
</head>
<body>
	<h2>회원 인증 입력 양식</h2>
		<form name="INPUT" action="exam01.jsp" method="get">
			<p>ID : <input type="text" name="ID" required></p>
			<p>PW : <input type="password" name="psw" placeholder="비밀번호" required></p>
			<p></p>
			<input type="submit" value="전송">
			<input type="reset" value="다시작성">	
		<br>
		<br>
			
	<h2>텍스트 공간 입력 양식</h2>		
		<textarea rows="5" cols="60" placeholder="텍스트를 작성하세요."></textarea>
		<p></p>
		<input type="submit" value="전송">
		<input type="reset" value="다시작성">

		<br>
		<br>

	<h2>당신의 성별은 무엇입니까?</h2>
		<input type="radio" name="sex" value="male" checked>남자
		<input type="radio" name="sex" value="female">여자
		<br>
		<br>
		<input type="reset" style="background-color:aqua;">
		<input type="reset" style="border: 1px solid #ff0000;">
		<input type="reset" style="border: 1px solid #ff0000; hover{color:blue}">
		<input type="reset" style="border:1px solid skyblue; background-color:rgba(0,0,0,0); color: skyblue; padding:5px; border-radius:10px;">
		<input type="reset" style="background-color:aqua; border-radius:10px;" >
		.input:hover {box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);}
		


		</button>

		


		</form>
</body>
</html>