<%-- 
    Document   : ecomerce
    Created on : Mar 29, 2020, 11:15:46 AM
    Author     : sicar
--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Content iu</title>
    </head>
    <body>
        <form method="POST" action="EcomerceController" name="frmAddProduct">
            ID_p : <input type="text" readonly="readonly" name="ID_p"value="<c:out value="${products.ID_p}" />" /> <br /> 
            Name : <input type="text" name="name"value="<c:out value="${products.name}" />" /> <br /> 
            Characteristics : <input type="text" name="charact"value="<c:out value="${products.charat}" />" /> <br /> 
            Price : <input type="text" name="price"value="<c:out value="${products.price}" />" /> <br /> 
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
