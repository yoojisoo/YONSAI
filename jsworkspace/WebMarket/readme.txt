0. DB 스키마 생성
1)CREATE DATABASE `webmarketdb`
2) resouce>sql  => 실행하기

----------------------
1. web.xml   =>
<filter>
		<filter-name>LogFileFilter</filter-name>
		<filter-class>filter.LogFileFilter</filter-class>
		<init-param>
			<param-name>filename</param-name>
			<param-value>d:\\class2\\logs\\webmarket.log</param-value>
		</init-param>
	</filter>

해당 경로에 로그 파일 만들기(d:\\class2\\logs\\webmarket.log)

-----------------------
2. ㅇ:/upload/ 만들기

resource/images에 있는 이미지를 복사 붙여넣기.


3. servers/Tomcat v9.0 at../tomcat-users.xml  파일 수정

  <role rolename="tomcat"/>
  <role rolename="role1"/>
  <role rolename="admin"/>
  <user username="tomcat" password="tomcat1234" roles="tomcat"/>
  <user username="both" password="both1234" roles="tomcat,role1"/>
  <user username="role1" password="role11234" roles="role1"/>
  <user username="admin" password="admin1234" roles="admin"/>

