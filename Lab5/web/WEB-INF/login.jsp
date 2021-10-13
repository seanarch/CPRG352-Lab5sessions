<%-- 
    Document   : login
    Created on : Oct 7, 2021, 10:24:17 PM
    Author     : seanz
--%>
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method = "POST" action = "home">
        <label>Username:</label>
        <input type="text" name="user_name" value="${User.username}">
        <br>
        <label>Password:</label>
        <input type="password" name="pass_word" value="${User.password}">
        <br>
        <input type="submit" value="Log in">
        </form>
    </body>
</html>
