<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Marcin
  Date: 06.10.2019
  Time: 09:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
    <link href="/webjars/bootstrap/3.4.0/css/bootstrap.min-jsf.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form action="/login" method="post">
        <div>
            <label for="login">Login:</label>
            <input type="text" id="login" name="login">
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password">
        </div>
        <div>
            <button type="submit" class="btn btn-success">Log in</button>
        </div>
    </form>
    <c:if test="${invalidLogin}">
        <div class="danger">
            Błąd logowania!
        </div>
    </c:if>
</div>
<script src="/webjars/jquery/3.4.1/jquery.min.js"/>
<script src="/webjars/bootstrap/3.4.0/js/bootstrap.min.js"/>
</body>
</html>

