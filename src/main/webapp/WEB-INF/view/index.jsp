<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
    </head>

    <body>
        <h1>Магазин</h1>
        <h2>Меню:</h2>
        <br>
        <a href="${pageContext.request.contextPath}/products/showAllProducts">Все товары</a>
        <br>
        <a href="${pageContext.request.contextPath}/products/addProduct">Добавить товар</a>
    </body>
</html>