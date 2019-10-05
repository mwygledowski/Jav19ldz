<%--
  Created by IntelliJ IDEA.
  User: Marcin
  Date: 05.10.2019
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <link href="webjars/bootstrap/3.4.0/css/bootstrap.min-jsf.css" rel="stylesheet">
    <title>Login</title>
</head>
<body>
<%@ include file="components/header.jsp" %>

<form action="${pageContext.request.contextPath}/login" method="POST">
    <div class="form-group">
        <label for="loginInput">Login</label>
        <input type="login" class="form-control" id="loginInput" name="login">
    </div>
    <div class="form-group">
        <label for="passwordInput">Password</label>
        <input type="password" class="form-control" id="passwordInput" name="password">
    </div>
        <button type="submit" class="btn btn-default">Zaloguj</button>
</form>

    <c:if test="${invalidLogin}">
        <div class="alert alert-danger" role="alert">
            <h3>Stranger danger! Błędne dane logowania.</h3>
        </div>
    </c:if>


<script src="webjars/jquery/3.4.1/jquery.min.js"/>
<script src="webjars/bootstrap/3.4.0/js/bootstrap.min.js"/>
</body>
</html>
