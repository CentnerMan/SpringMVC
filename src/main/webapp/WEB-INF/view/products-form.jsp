<%--
  Created by IntelliJ IDEA.
  @author Anatoly Lebedev
  @link https://github.com/Centnerman
  Date: 20.10.2019 Time: 17:34
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>

<html>
<body>
<h1>Form Example</h1>
<form action="advProcessForm" method="GET">
    <input type="text" name="productName" placeholder="Enter product name"/>
    <input type="submit"/>
</form>
<br>
<a href="${pageContext.request.contextPath}/">to Index Page</a>
</body>
</html>
