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
            Name : <input type="text" name="name"value="<c:out value="${prod.name}" />" /> <br /> 
            Characteristics : <input type="text" name="charact"value="<c:out value="${user.charat}" />" /> <br /> 
            Price : <input type="text" name="price"value="<c:out value="${user.price}" />" /> <br /> 
        </form>
    </body>
</html>
