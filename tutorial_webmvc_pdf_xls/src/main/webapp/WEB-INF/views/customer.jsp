
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <head>
        <spring:url value="/pdf" var="pdfLink" />
        <spring:url value="/xls" var="xlsLink" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer</title>
    </head>
    <body>
        <h1>Customer List</h1>
        <table border="1">
            <tr>
                <th style="width:  50px;">ID</th>
                <th style="width: 150px;">Nombre</th>
                <th style="width: 150px;">Apellido</th>
                <th style="width: 150px;">Calle</th>
                <th style="width: 150px;">Ciudad</th>
            </tr>
            <c:forEach var="customer" items="${customerList}">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.street}</td>
                    <td>${customer.city}</td>
                </tr>
            </c:forEach>
        </table>

        <div style="
             border: 1px solid darkgray;
             padding: 10px 5px; 
             margin: 20px;
             border-radius: 5px;
             background: #cccccc;
             text-align: center;">
            <span>Descargar: </span>
            <a href="${pdfLink}">Archivo PDF</a>
            <span> | </span>
            <a href="${xlsLink}">Archivo XLS</a>
        </div>
    </body>
</html>
