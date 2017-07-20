<%-- 
    Document   : home
    Created on : 07/18/2017, 07:55:34 AM
    Author     : Tutor de programacion
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload File</title>
    </head>
    <body>

        <h1>Spring MVC File Upload</h1>

        <form method="post" action="/upload/form" enctype="multipart/form-data">
            <input type="file" name="file" accept="image/jpeg,image/png,image/gif"/>
            <input type="submit" value="Subir archivo"/>
        </form>

        <div style="margin-top: 30px;">
            
            <h3>Imágenes en la base de datos</h3>
            
            <table cellspacing="0" cellpadding="6" border="1">
                <tr bgcolor="grey" style="color: white">
                    <th>No</th>
                    <th>Nombre</th>
                    <th>Tipo</th>
                    <th>Tamaño (Bytes)</th>
                    <th>Ver imagen</th>
                </tr>
                <c:forEach var="img" items="${imageList}" varStatus="status">
                    <tr>
                        <td><b>${status.index + 1}</b></td>
                        <td>${img.get("NOMBRE")} </td>
                        <td>${img.get("TIPO")} </td>
                        <td>${img.get("TAMANO")} </td>
                        <td><a href="/upload/image?nombre=${img.get("NOMBRE")}">ver</a> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </body>
</html>
