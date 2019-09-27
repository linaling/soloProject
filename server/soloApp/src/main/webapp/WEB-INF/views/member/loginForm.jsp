<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://13.125.12.186/css/normal.css" />
</head>
<body>
	
	<h1>MEMBER LOGIN</h1>
	
	<form:form action="http://13.125.12.186/v1/login" method="post" commandName="member">
		<table>
			<tr>
				<td>ID</td>
				<td><form:input path="memId" /></td>
			</tr>
			<tr>
				<td>PW</td>
				<td><form:password path="memPw" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login" ></td>
			</tr>
		</table>
	</form:form>
	
	<a href="http://13.125.12.186/index.jsp">MAIN</a>
</body>
</html>