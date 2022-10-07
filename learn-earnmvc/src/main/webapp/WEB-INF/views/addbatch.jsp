<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="submitbatchdetail" method="post">
<center>
<table>

<h1><i style="color: red">all Details are mandatory </i></h1>
<h2><i style="color: red">if any query plese call 8788033661 </i></h2>
<table style="background-color: #4d5d78">
<tr>
<td>
<label><i style="color: pink">Batch Name</i></label>
</td>
<tr>
<td>

<input type="text" name="bname" ><br><br>
</td>
</tr>
<tr>
<td>
<label><i style="color: pink">Mentor Name</i></label>
</td>
</tr>
<tr>
<td>

      <select name="Mentor" id="mnt" multiple>
        <option value="ak">Ajay Kumar Bennur</option>
        <option value="TP">Trupti</option>
        <option value="swt">Swati</option>
        <option value="nlm">Naleem</option>
        <option value="drsn">Darshan</option>
     
      </select>
</td>
</tr>
<tr>
<td>
<label><i style="color: pink">Technology</i></label>
</td>
</tr>
<tr>
<td>
      <select name="languages" id="lang" multiple>
        <option value="core-java">Core Java</option>
        <option value="react">React</option>
        <option value="angular">Angular</option>
        <option value="jspb">Java + Spring Boot</option>
        <option value="node">Node & Express js</option>
     
      </select>
</td>
</tr>
<tr>
<td>
<label><i style="color: pink">Start Date</i></label>
</td>
</tr>
<tr>
<td>

<input type="date" name="date" ><br><br>
</td>
</tr>
<tr>
<td>
<label><i style="color: pink">End Date</i></label>
</td>
</tr>
<tr>
<td>

<input type="date" name="edate" ><br><br>
</td>
</tr>
<tr>
<td>
<tr>
<td colspan="2">
 <input type="submit" value="submit the details "><br><br>
 
</td>
</tr>





</table>
</center>





</form>
</body>
</html>