<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin login</title>
</head>
<body style="background-color: 517abd">
<form action="./gethomepage" method="post" >
<center>
<h1><i style="color: red">wel-come to Techno Elevate admin </i></h1>
<table style="background-color: #4d5d78">
<tr>
<td>
<label><i style="color: pink">Employee id</i></label>
</td>
<tr>
<td>

<input type="text" name="Employeeid" ><br><br>
</td>
</tr>
<tr>
<td>
<label><i style="color: pink">Password</i></label>
</td>
</tr>
<tr>
<td>
<input type="password" name="password" ><br><br>
</td>
</tr>
<tr>
<td colspan="2">
 <input type="submit" value="login"><br><br>
 
</td>
</tr>
</table>
<br><br><a href="./adminform">click here if you dont have account</a>
</center>
</form>

</body>
</html>