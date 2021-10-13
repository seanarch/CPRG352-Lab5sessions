<%-- 
    Document   : home
    Created on : Oct 10, 2021, 8:31:26 PM
    Author     : seanz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
         
        <b>Hello ${User.username}</b>
        <br>
        <a href="home?logout">Log out</a>
         
    </body>
</html>
