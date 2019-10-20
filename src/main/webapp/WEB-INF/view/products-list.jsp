<%--
  Created by IntelliJ IDEA.
  @author Anatoly Lebedev
  @link https://github.com/Centnerman
  Date: 20.10.2019 Time: 17:35
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>

<html>
<head>
    <title>Products list</title>
</head>
<body>
    <h1>All products</h1>
    <c:forEach var="product" items="${products}">
<%--        <span>Id: ${product.id} Title: ${product.title} Cost: ${product.cost}</span>--%>
        <span>${product.id} ${product.title} ${product.cost}</span>
        <br>
    </c:forEach>
</body>
</html>
