<%--
  Created by IntelliJ IDEA.
  @author Anatoly Lebedev
  @link https://github.com/Centnerman
  Date: 20.10.2019 Time: 17:34
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>

<body>
<form:form action="addProductProcess" modelAttribute="product">
    Id: <form:input path="id"/>
    <br>
    Title: <form:input path="title"/>
    <br>
    Cost: <form:input path="cost"/>
    <br>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
