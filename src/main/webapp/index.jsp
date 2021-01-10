<%--
  Created by IntelliJ IDEA.
  User: sixbi
  Date: 05.01.2021
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%
            java.util.Date now = new java.util.Date();
            String someString = "Текущая дата : " + now;
        %>
        <%= someString %>
    </p>

    <p>
        <%
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
        %>

        <%= "Hello, " + name + " " + surname %>
    </p>
</body>
</html>
