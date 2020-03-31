<%-- 
    Document   : buy
    Created on : Mar 30, 2020, 11:46:38 AM
    Author     : sicar
--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="${pageContext.request.contextPath}/EcomerceController" name="frmAddProduct">
            ID : <input type="text" readonly="readonly" name="proId" value="<c:out value="${products.ID_prodt}" />" /> <br /> 
            Name : <input type="text" readonly="readonly" name="name"value="<c:out value="${products.name}" />" /> <br /> 
            Characteristics : <input type="text" readonly="readonly" name="charact"value="<c:out value="${products.charat}" />" /> <br /> 
            Price : <input type="text" readonly="readonly" name="price"value="<c:out value="${products.price}" />" /> <br />
            Quantity : <input type="number"  name="quanti"/><br />
            IVA : 16%<br />
            <input type="submit" name="button1" value="Buy" />
        </form>
        
    </body>
</html>
