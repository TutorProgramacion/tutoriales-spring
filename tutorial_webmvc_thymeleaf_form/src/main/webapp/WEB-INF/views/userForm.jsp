<%@page contentType="text/html; charset=ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<html>
    <head>
        <title>Spring MVC Form Validation</title>
        <style type="text/css">
            .formFieldError { 
                background-color: #FFC;
                color: #ae1d1d; 
                font-style: italic;
            }
            
            .errorblock{
                color: #000;
                background-color: #ffEEEE;
                border: 1px solid #ff0000;
                padding: 8px;
                margin: 16px;
                font-style: italic;
            }
        </style>
    </head>
    <body>
        <h2>Registrar Usuario:</h2>
        <mvc:form modelAttribute="usuario" action="create">
            <mvc:errors path="*" cssClass="errorblock" element="div"/>
            <table>
                <tr>
                    <td><mvc:label  path="nombre">Nombre: </mvc:label></td>
                    <td><mvc:input  path="nombre" cssErrorClass="formFieldError" /></td>
                    <td><mvc:errors path="nombre" /></td>
                </tr>
                <tr>
                    <td><mvc:label  path="apellido">Apellido: </mvc:label></td>
                    <td><mvc:input  path="apellido" cssErrorClass="formFieldError" /></td>
                    <td><mvc:errors path="apellido" /></td>
                </tr>
                <tr>
                    <td><mvc:label  path="correo">EMail: </mvc:label></td>
                    <td><mvc:input  path="correo" cssErrorClass="formFieldError" /></td>
                    <td><mvc:errors path="correo" /></td>
                </tr>
                <tr>
                    <td><mvc:label  path="password">Contraseña: </mvc:label></td>
                    <td><mvc:input  path="password" cssErrorClass="formFieldError" /></td>
                    <td><mvc:errors path="password" /></td>
                </tr>
                <tr>
                    <td><mvc:label  path="edad">Edad: </mvc:label></td>
                    <td><mvc:input  path="edad" cssErrorClass="formFieldError" /></td>
                    <td><mvc:errors path="edad" /></td>
                </tr>
                <tr>
                    <td><mvc:label  path="sexo">Sexo: </mvc:label></td>
                    <td><mvc:input  path="sexo" cssErrorClass="formFieldError" /></td>
                    <td><mvc:errors path="sexo" /></td>
                </tr>            
                <tr>
                    <td colspan="1">
                        <input type="submit" value="Submit" />
                    </td>
                </tr>
            </table>
        </mvc:form>
    </body>
</html>