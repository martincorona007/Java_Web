<%-- 
    Document   : newjsp
    Created on : Feb 26, 2020, 2:46:45 PM
    Author     : sicar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        String a=request.getParameter("fname_a");
        String b=request.getParameter("fname_b");
        String c=request.getParameter("fname_c");
        double da=Double.parseDouble(a);
        double db=Double.parseDouble(b);
        double dc=Double.parseDouble(c);
        double res1,res2;
        res1=(-db+Math.sqrt(Math.pow(db, 2)-4*da*dc))/(2*da);
        res2=(-db-Math.sqrt(Math.pow(db, 2)-4*da*dc))/(2*da);
        
        // res1=(-db+Math.sqrt(Math.pow(db, 2)-4*da*dc))/(2*da);
       // res2=(-db-Math.sqrt(Math.pow(db, 2)-4*da*dc))/(2*da);    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <td>First Root</td>
                <td><% out.print(res1); %></td>
            </tr>
            <tr>
                <td>Second Root</td>
                <td><% out.print(res2); %></td>
            </tr>
        </table>
    </body>
</html>
