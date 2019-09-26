<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students list</title>
</head>
<body>


<h1>All students from result</h1>
<c:forEach items="${students}" var="student">
    <h3>Student id = ${student.id} first name = ${student.firstName}; last name = ${student.lastName}</h3>
</c:forEach>
</body>
</html>
