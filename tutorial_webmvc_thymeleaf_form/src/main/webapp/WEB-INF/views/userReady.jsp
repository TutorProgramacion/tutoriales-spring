<%@page contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Spring MVC Form Validation</title>
    </head>
    <body>
        <h2>Usuario creado correctamente:</h2>
        <h4>${usuario.nombre}, ${usuario.apellido}</h4>
        <a href="${pageContext.servletContext.contextPath}/user/form">Crear usuario</a>
    </body>
</html>
