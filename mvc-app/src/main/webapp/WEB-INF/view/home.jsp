<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>


<form action="${pageContext.request.contextPath}/search-by-id" method="POST">
    Enter student id:
    <input type="text" name="studentId"/>
    <input type="submit" value="Search">
</form>

</body>
</html>
