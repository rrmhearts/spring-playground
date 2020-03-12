<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title</title>
    </head>
    <body>
        <h1>Model Tutorial</h1> <!--JSPL format-->
        <h3>Add Alien</h3>
        <form action="addAlien">
            <input type="text" name="aid"><br>
            <input type="text" name="aname"><br>
            <input type="text" name="tech"><br>
            <input type="submit"><br>
        </form>

        <!-- second form to fetch it.. -->
        <h3>Retrieve by AId</h3>
        <form action="getAlien">
            <input type="text" name="aid"><br>
            <input type="submit"><br>
        </form>

    </body>
</html>

<!-- 
    In MVC, this is a View
-->
<!--
    Call this view at
    localhost:8080/home
-->