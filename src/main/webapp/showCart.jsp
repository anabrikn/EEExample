<%--
  Created by IntelliJ IDEA.
  User: sixbi
  Date: 06.01.2021
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<%@page import="logic.Cart" %>
    <% Cart cart = (Cart) session.getAttribute("cart"); %>
    <p>
        Наименование: <%= cart.getName() %>
    </p>

    <p>
        Количество: <%= cart.getQuantity() %>
    </p>
</body>
</html>
