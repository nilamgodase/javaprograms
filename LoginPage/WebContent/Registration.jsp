<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Registration Page !!!</h1>

	<form action="LoginRegister" method="post">
		<table
			style="background-color: Yellow">
			<tr>
			<td><h2>${successmessage}</h2></td>
			</tr>
			<tr>
				<td>First Name :</td>
			<td><input type="text" name="name1"></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="name2"></td>
			</tr>
			<tr>
				<td>UserId :</td>
				<td><input type="text" name="num" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"></td>
			</tr>
			<tr>
				<td>EmailId :</td>
				<td><input type="text" name="EmailId" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"></td>
			</tr>
			<tr>
				<td>ContactNumber :</td>
				<td><input type="text" name="ContactNumber"pattern="[789][0-9]{9}"title="Must be Upto 10 digits"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 4 or more characters" required></td>
			</tr>
			<tr>
				<td>Re-Type-Password :</td>
		<td><input type="password" name="Re-Type-Password " pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 4 or more characters" required></td> 
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Register"></td>
				<td></td>
			</tr>
		</table>

	</form>
</body>
</html>