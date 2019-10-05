<%--
  Created by IntelliJ IDEA.
  User: Marcin
  Date: 05.10.2019
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <link href="webjars/bootstrap/3.4.0/css/bootstrap.min-jsf.css" rel="stylesheet">
    <title>Registration</title>
</head>
<body>
<%@ include file="components/header.jsp" %>

<form action="${pageContext.request.contextPath}/zarejestruj" method="POST">
    <div class="form-group">
        <label for="loginInput">Login</label>
        <input type="text" class="form-control" id="loginInput" name="login">
    </div>
    <div class="form-group">
        <label for="nameInput">Imie</label>
        <input type="text" class="form-control" id="nameInput" name="name">
    </div>
    <div class="form-group">
        <label for="surenameInput">Nazwisko</label>
        <input type="text" class="form-control" id="surenameInput" name="surename">
    </div>
    <div class="form-group">
        <label for="passwordInput">Password</label>
        <input type="text" class="form-control" id="passwordInput" name="password">
    </div>
    <div class="form-group">
        <label for="emailInput">Email</label>
        <input type="email" class="form-control" id="emailInput" name="email">
    </div>
    <button type="submit" class="btn btn-default">Zarejestruj</button>
</form>

<script src="webjars/jquery/3.4.1/jquery.min.js"/>
<script src="webjars/bootstrap/3.4.0/js/bootstrap.min.js"/>
</body>
</html>
