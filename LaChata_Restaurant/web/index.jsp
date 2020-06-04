<%-- 
    Document   : index
    Created on : Jun 3, 2020, 7:16:00 PM
    Author     : sicar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:forward page="/RestaurantController?action=listMenu" />
    </body>
</html>
