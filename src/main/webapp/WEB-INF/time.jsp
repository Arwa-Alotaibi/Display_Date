<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Time :)</title>

<link rel="stylesheet" type="text/css" href="/css/time.css">

<script type="text/javascript" src="/js/time.js"></script>
</head>
<body>

<p> <c:out value="${current_time }"></c:out> </p>


</body>
</html>