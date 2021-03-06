<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹 페이지 레이아웃</title>
<script src="js/jquery-3.6.0.js"></script>

<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<style>
body {
	font: 14px/1.8 Arial, Helvetica, sans-serif;
}

.frame {
	width: 800px;
	margin: 0 auto;
	border: 1px solid #aaa;
}

.header {
	padding: 40px 10px;
	text-align: center;
	background: #eee;
	margin-bottom: 20px;
}

.logo {
	font-size: 2em;
	font-weight: bold;
	background: #5457de;
	color: #fff;
	display: inline-block;
	padding: 0 8px;
}

.container {
	overflow: hidden;
}

.nav {
	float: left;
	width: 150px;
	background: #333;
	color: #fff;
	margin-right: 50px;
}

.nav-list {
	list-style: none;
	margin: 0;
	padding: 10px 0;
}

.nav-item {
	margin: 4px 0;
}

.nav-link {
	display: block;
	text-decoration: none;
	color: #fff;
	padding: 4px 10px;
}

.nav-link:hover {
	background: #5457de;
}

.content {
	float: left;
	width: 600px;
}

.footer {
	text-align: center;
	border-top: 1px solid #aaa;
	margin: 20px 20px 0;
	font-size: 12px;
}
</style>
</head>
<body>
	<div class="frame">
		<jsp:include page="include/header.jsp"></jsp:include>
		<div class="container">
			<div class="nav">
				<ul class="nav-list">
					<li class="nav-item"><a href="#" class="nav-link">메뉴1</a></li>
					<li class="nav-item"><a href="#" class="nav-link">메뉴2</a></li>
					<li class="nav-item"><a href="#" class="nav-link">메뉴3</a></li>
				</ul>
			</div>
				<div class="content">
					<h1>레이아웃을 구성함.</h1>
					<div>
					정규 표현식은 문자열에 나타는 특정 문자 조합과 대응시키기 위해 사용되는 패턴입니다.<br>
					자바스크립트에서,정규 표현식 또한 객체입니다. 이 패턴들은 RegExp의 exec 메소드와<br>
					test메소드, 그리고 String의 match메소드, replace메소드, search메소드,<br>
					이 장에서는자바스크립트의 정규식에 대하여 설명합니다.
					</div>
					
					<!-- Button trigger modal -->
					<button type="button" class="btn btn-primary btn-lg"
						data-toggle="modal" data-target="#myModal">Launch demo	modal</button>

				</div>
			<!-- Modal -->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">제목</h4>
						</div>
						<div class="modal-body">내용 내용</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary">Save
								changes</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="include/foot.jsp"></jsp:include>
	</div>
</body>
</html>