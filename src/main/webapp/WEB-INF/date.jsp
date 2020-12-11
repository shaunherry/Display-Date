<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type=text/css href="static/DateStyle.css">
<title>Date</title>
</head>
<body>
<h1>TIME</h1>
<p class = "date" ><fmt:formatDate type = "date" value = "${date}" /></p>

</body>
</html>