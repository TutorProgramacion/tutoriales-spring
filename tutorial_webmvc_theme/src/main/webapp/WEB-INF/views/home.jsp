<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
    <head>
        <link rel="stylesheet" href="<spring:theme code='stylesheet'/>" type="text/css" />
        <title>Spring MVC ThemeResolver</title>
    </head>
    <body>

        <h1>Spring MVC ThemeResolver</h1>
        <h3>Tema actual: <spring:theme code='name'/> </h3>
        aplicar tema: <a href="?mytheme=claro">claro</a> | <a href="?mytheme=oscuro">oscuro</a>

    </body>
</html>
