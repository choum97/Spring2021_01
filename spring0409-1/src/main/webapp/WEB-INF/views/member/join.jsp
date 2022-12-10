<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>이것은 jsp 파일입니다.</h1>
   
   	이름 : ${member.name }<br/>
	아이디 : ${member.id }<br/>
	비밀번호 : ${member.pw }<br/>
	이메일 : ${member.email }<br/>
   
<%--    이름 : ${memberInfo.name }<br/>
   아이디 : ${memberInfo.id }<br/>
   비밀번호 : ${memberInfo.pw }<br/>
   이메일 : ${memberInfo.email }<br/> --%>
</body>
</html>