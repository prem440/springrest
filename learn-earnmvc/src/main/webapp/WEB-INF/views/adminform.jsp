<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>/adminform</title>
<form action="./justthankyoumsg" method="post" >
<center>
<h1><i style="color: red">wel-come to Techno Elevate </i></h1>
<h2><i style="color: red">please fill the details </i></h2>
<table style="background-color: #4d5d78">
<tr>
<td>
<label><i style="color: pink">Employee id</i></label>
</td>
<tr>
<td>

<input type="text" name="Employeeid" placeholder="Enter pattern {a-z,A-Z,0-9,@#$%^&" ><br><br>
</td>
</tr>
<tr>
<td>
<label><i style="color: pink">Password</i></label>
</td>
</tr>
<tr>
<td>
<input type="password" name="password" placeholder="please enter Strong password" ><br><br>
</td>
</tr>
<tr>
<td>
<label><i style="color: pink">Email id</i></label>
</td>
</tr>
<tr>
<td>
<input type="email" name="email" placeholder="please enter email id" ><br><br>
</td>
</tr>
<tr>
<td colspan="2">
 <input type="submit" value="submit the details "><br><br>
 
</td>
</tr>
</table>

</center>
</form>
</head>
</html>