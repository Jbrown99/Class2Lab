<%-- 
    Document   : welcome
    Created on : Jan 26, 2016, 8:06:23 PM
    Author     : joshuabrown
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Page</title>
    </head>
    <body>
         <h1>Greeting Demo</h1>
        <form method ="POST" action="GreeterController">
            <label>Enter Name</label>
            <!-- comment-->
            <input type="text" name="username" value=""/>
            <input type="submit" name="submit" value="Say Hello"/>
        </form>   
    </body>
</html>
