<%--
  Created by IntelliJ IDEA.
  User: sixbi
  Date: 06.01.2021
  Time: 0:20
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
    <%@ page import="java.util.Date, logic.TestClass" %>

    <%
        out.println("Hi!!!");
        out.println(" You have been redirected :)");
    %>
    <%= new Date() %>

    <%
        TestClass testClass = new TestClass();
        out.println("<p>" + testClass.getSomething() + "</p>");
    %>
</p>
</body>
</html>