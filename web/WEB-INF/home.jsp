<%-- 
    Document   : home
    Created on : Oct 12, 2020, 8:52:41 PM
    Author     : 759005
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Hello ${user.username}</h2>
        <a href="login?logout"> Log Out</a>
    </body>
</html>
