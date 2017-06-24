<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
    <head> 
        <title>Validar Formulario</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="static/materializecss/css/materialize.min.css" type="text/css" rel="stylesheet" />  

        <style type="text/css">
            .input-error { margin-bottom: 6px !important; }
            .text-error { font-size: 0.8em !important; }
        </style>

    </head>
    <body>
        <div class="container">

            <div class="row">
                <h3 class="indigo-text center">Formulario de registro</h3>
            </div>

            <div class="row">

                <core:url value="/validar" var="validarUrl"/>
                <form:form method="POST" modelAttribute="person" action="${validarUrl}">

                    <form:errors path="*" cssClass="card-panel red lighten-2" element="div" />

                    <div class="row">
                        <div class="input-field col s6">
                            <form:label  path="nombre" >Nombre</form:label>   
                            <form:input  path="nombre" cssErrorClass="invalid input-error" />   
                            <form:errors path="nombre" element="div" cssClass="red-text text-error"/>                             
                        </div>

                        <div class="input-field col s6">
                            <form:label  path="apellido" >Apellido</form:label>   
                            <form:input  path="apellido" cssErrorClass="invalid input-error" />   
                            <form:errors path="apellido" element="div" cssClass="red-text text-error"/>  
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s12">
                            <form:label  path="correo" >Correo</form:label>   
                            <form:input  path="correo" cssErrorClass="invalid input-error" />   
                            <form:errors path="correo" element="div" cssClass="red-text text-error"/>  
                        </div>
                    </div>
                        
                    <div class="row">
                        <div class="input-field col s12">
                            <form:label  path="edad" >Edad</form:label>
                            <form:input  path="edad" cssErrorClass="invalid input-error" />
                            <form:errors path="edad" element="div" cssClass="red-text text-error" />  
                        </div>
                    </div> 
                        
                    <div class="row">
                        <div class="input-field col s12">
                            <form:select path="nacionalidad" items="${paisList}" cssErrorClass="invalid input-error" />
                            <form:errors path="nacionalidad" element="div" cssClass="red-text text-error"/>  
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col">
                            <input type="submit" value="Enviar" class="btn waves-effect"/>
                        </div>
                    </div>

                </form:form>

            </div>
        </div>

        <script src="static/jquery/jquery.min.js"></script>
        <script src="static/materializecss/js/materialize.min.js"></script>       

        <script type="text/javascript" >
            $(document).ready(function () {
                $('select').material_select();
            });
        </script>
    </body>
</html>
