<%-- 
    Document   : display
    Created on : Mar 12, 2020, 2:10:30 PM
    Author     : sicar
--%>

<%@page import="model.ProductBEAN"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.ClientDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <%
                ArrayList<ProductBEAN> cl1=new ArrayList<ProductBEAN>();
                cl1=(ArrayList<ProductBEAN>)request.getAttribute("products");
                out.println("<tr><th>Nombre </th><th>Cantidad </th><th>Precio</th></tr>");
                for(int i=0;i<cl1.size();i++){
                    ProductBEAN da=new ProductBEAN();
                    da=cl1.get(i);
                    out.println("<tr>");
                    out.println("<td>"+da.getName()+"</td>");
                    out.println("<td>"+da.getQuantity()+"</td>");
                    out.println("<td>"+da.getTotal()+"</td>");
                    out.println("</tr>");
                }
            %>
        </table>
    </body>
</html>
