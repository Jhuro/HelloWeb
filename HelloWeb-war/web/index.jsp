<%-- 
    Document   : index
    Created on : 12/03/2022, 11:20:19 PM
    Author     : jupbc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="Formato de entrada" action="response.jsp">
            <h1>Ingrese su nombre</h1>
            <input type="text" name="name"/>
            <h1>Ingrese su fecha de nacimiento</h1>
            <input type="date" name="fechaDeNacimiento"/>
            <input type="submit" value="Ok" />
        </form>
    </body>
</html>
