<%-- 
    Document   : listEcomerce
    Created on : Mar 29, 2020, 8:47:12 AM
    Author     : sicar
--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Products</title>
    </head>
    <body>
       <table border=1>
            <thead>
                <tr>
                    <th>Product Id</th>
                    <th>Name</th>
                    <th>Characteristics</th>
                    <th>Price</th>
                    <th colspan=3>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${products}" var="prod">
                    <tr>
                        <td><c:out value="${prod.ID_p}" /></td>
                        <td><c:out value="${prod.name}" /></td>
                        <td><c:out value="${prod.charact}" /></td>
                        <td><c:out value="${prod.price}" /></td>
                        <td><a href="EcomerceController?action=edit&prodId=<c:out value="${prod.ID_p}"/>">Update</a></td>
                        <td><a href="EcomerceController?action=delete&prodId=<c:out value="${prod.ID_p}"/>">Delete</a></td>
                        
                    </tr>
                </c:forEach>
                    
            </tbody>
        </table>
        <p><a href="EcomerceController?action=insert">Add Product</a></p>
    </body>
</html>
