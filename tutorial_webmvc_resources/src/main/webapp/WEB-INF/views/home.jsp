<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <title>Contenido estatico</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="static/css/style.css" type="text/css" rel="stylesheet" />
        <link href="static/font-awesome/css/font-awesome.css" type="text/css" rel="stylesheet" />
       
        <script src="static/jquery/jquery.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('img').fadeOut(5000);
            });
        </script>

    </head>
    <body>
        <h1 class="title">Tutoriales Spring Framework</h1>
        <img src="static/images/spring-by-pivotal.png" alt="Spring Image"/>
        <br />
        <span class="fa fa-2x fa-github">Font Awesome Icon</span>
    </body>
</html>
