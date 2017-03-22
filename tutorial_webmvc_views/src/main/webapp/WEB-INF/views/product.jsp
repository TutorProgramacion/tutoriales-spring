<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title>
    </head>
    <body>
        <h1>Listado de Productos</h1>
        <div style="padding: 10px;"><a href="${pageContext.request.contextPath}/product/form">Agregar Producto...</a></div>
        <table border="1">
            <tr>
                <th style="width:  50px;">No</th>
                <th style="width: 250px;">Nombre</th>
                <th style="width: 150px;">Precio</th>
                <th style="width: 100px;"></th>
            </tr>
            <c:forEach var="product" 
                       items="${productList}"
                       varStatus="status">
                <tr>
                    <td><b>${status.index + 1}</b></td>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td><a href="${pageContext.request.contextPath}/product/delete/${product.id}">Borrar</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
