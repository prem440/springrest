<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  margin: 0;
  font-family:cursive;
}

.topnav {
  overflow: hidden;
  background-color: #a010e8;
}

.topnav a {
  float: right;
  color: #97a60d;
  text-align: center;
  padding: 7px 10px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: purple;
  color: red;
}

.topnav a.active {
  background-color: #6d5b7d;
  color: white;
}
</style>
</head>
<body>

<div class="topnav">
  <a class="active" href="./one"><i>New Batch</i></a>
  <a href="./two"><i>Logout</i></a>
  <a href="./three"><i>Mentor</i></a>
  <a href="./four"><i>Request</i></a>
  <a href="./five"><i>Batch</i></a>
  
</div><br><br>
<center>
<table border="2px">
<tr>
<th>No</th>
<th>Batch-Id</th>
<th>Batch-Name</th>
<th>Mentor-Name</th>
<th>Technology</th>
<th>Start-Date</th>
<th>End-Date</th>
<th>Status</th>
<th>Action</th>
</tr>





</table>
</center>

</body>
</html>
