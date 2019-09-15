<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h1>
    <%
        int a = 1 * 8;
        out.write("Hello World from jsp" + a);
        out.println("printline");
        for (int i =0 ; i< 10; i++){
            out.write("Hello World from jsp" + i + "</br>");
        }
    %>
</h1>
</body>
</html>
