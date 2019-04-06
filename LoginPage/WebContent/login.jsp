<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	               <h1>Welcome to Login page </h1>
	<form action="LoginRegister" method="post">
		<table
			style="background-color: skyblue">
			<tr>
				<td><h3>${message}</h3>
					<h2>${successmessage}</h2>
					<h4>${message2}</h4></td>
			</tr>
			<tr>
				<td>UserId :</td>
				<td><input type="text" name="num" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 4 or more characters" required></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Login"></td>
				<td><a href="Registration.jsp">Registration</a></td>
			</tr>
		</table>
	</form>
</body>
</html>