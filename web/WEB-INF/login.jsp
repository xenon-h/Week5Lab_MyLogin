<%-- 
    Document   : login
    Created on : Oct 12, 2020, 8:52:49 PM
    Author     : 759005
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body action="" method="post" >
        <h1>Login</h1>
        <form>
            Username:<input type="text" name="username" value="${username}"><br>
            Password:<input type="password" name="password" value="${password}"><br>
            <input type="submit" value="Log In">
        </form>
        <h3>${message}</h3>
    </body>
</html>
