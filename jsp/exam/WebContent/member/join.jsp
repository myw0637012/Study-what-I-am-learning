<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1>

<form name = "DirForm" method="post" action="/member/joinProc.do">
아이디 : <input type="text" name="id" value="">
<br><br>
이름 : <input type="text" name="name" value="">
<br><br>
<input type="submit" value="가입하기">
</form>
</body>
</html>