<%-- 
    Document   : image.jsp
    Created on : 07/19/2017, 11:02:20 AM
    Author     : Tutor de programación
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Image View</title>
    </head>
    <body>
        <h1>Visor de Imagen</h1>
        <h4>Mostrando la imagen: <i>${nombre}</i></h4>
        <img src="/upload/uploaded?nombre=${nombre}" />
    </body>
</html>
