<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head lang="en">
    <meta charset="UTF-8">
    <title>Passenger Details !</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body style="background-color:powderblue;" >

<style>
body {
  background-image: url('image.jpg');
  background-size: cover;
}
</style>

<h2><p style="color:#CD5C5C">Following is the list of all the passengers !</p></h2>
<p></p>
<b>${pass[0]}</b>
<p></p>
<b>${pass[1]}</b>
<p></p>
<b>${pass[2]}</b>
<p></p>
<b>${pass[3]}</b>
</body>
</html>