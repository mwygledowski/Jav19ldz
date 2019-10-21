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
    <title>Home</title>
    <link href="/webjars/bootstrap/3.4.0/css/bootstrap.min-jsf.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <table class="table table-striped">
        <tr>
            <th>#</th>
            <th>Title</th>
            <th>Category</th>
            <th>Creation Date</th>
            <th>Deadline</th>
            <th>Description</th>
            <th></th>
            <th></th>
            <th></th>
        </tr>
        <c:set var="i" value="1"/>
        <c:forEach items="${toDoList}" var="entity">

            <tr <c:if test="${entity.done}"> style="background-color: green;"</c:if>>
                <td>${i}</td>
                <td>${entity.name}</td>
                <td>${entity.category}</td>
                <td>${entity.creationDate}</td>
                <td>${entity.deadline}</td>
                <td>${entity.description}</td>
                <td>
                    <form action="${pageContext.request.contextPath}/to-do/markAsDone" method="POST">
                        <button type="submit" class="btn btn-success" name="toDoId" value="${entity.id}">Done</button>
                    </form>
                </td>
                <td>
                    <button type="button" class="btn btn-info">Edit</button>
                </td>
                <td>
                    <button type="button" class="btn btn-danger">Remove</button>

                </td>
            </tr>
            <c:set var="i" value="${i+1}"/>
        </c:forEach>
    </table>

    <form action="/to-do/add" method="post">
        <div>
            <label for="title">Title:</label>
            <input type="text" id="title" name="title">
        </div>

        <div>
            <label for="category">Category:</label>
            <select id="category" name="category">
                <c:forEach items="${categories}" var="category">
                    <option value="${category}">${category}</option>
                </c:forEach>
            </select>
        </div>

        <div>
            <label for="deadline">Deadline:</label>
            <input type="datetime-local" name="deadline" id="deadline">
        </div>
        <div>
            <label for="description">Description:</label>
            <input type="text" id="description" name="description">
        </div>
        <div>
            <button type="submit" class="btn btn-success">Add</button>
        </div>
    </form>
    <form action="/to-do/logout" method="get">
        <button type="submit" class="btn btn-success">Log out</button>
    </form>
</div>
<script src="/webjars/jquery/3.4.1/jquery.min.js"/>
<script src="/webjars/bootstrap/3.4.0/js/bootstrap.min.js"/>
</body>
</html>
