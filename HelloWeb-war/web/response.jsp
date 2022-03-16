<%-- 
    Document   : response
    Created on : 12/03/2022, 11:20:32 PM
    Author     : jupbc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="co.edu.unipiloto.hello.NameHandler"/>
        <jsp:useBean id="clock" scope="session" class="java.util.Date"/>
        <jsp:setProperty name="mybean" property="name"/>
        <jsp:setProperty name="mybean" property="fechaDeNacimiento"/>
        
        <h1>
            <c:choose>
                <c:when test = "${clock.hours >= 0 && clock.hours < 12}"> 
                Buenos días
            </c:when>

            <c:when test = "${clock.hours >= 12 && clock.hours < 18}"> 
                Buenas tardes
            </c:when>

            <c:when test = "${clock.hours >= 18}"> 
                Buenas noches
            </c:when>
        </c:choose> 
            <jsp:getProperty name="mybean" property="name" />
            , tienes <jsp:getProperty name="mybean" property="edad" /> años.</h1>

    </body>
</html>
