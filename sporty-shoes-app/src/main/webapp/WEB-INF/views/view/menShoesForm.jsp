<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" errorPage="Error.jsp"%>
<%@ taglib  uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mens Shoes</title>
</head>
<body>
<%@include file="homeHeader.jsp" %>
<h2>Men's Shoes</h2>
<table>
 
<c:forEach items="${menshoeData}" var="fss">
<tr>
<td><span>
              <a href="selectedShoe?id=<c:out value='${fss.id}' />">
                <img src="${fss.imagelink}" style="float: left; width: 30%; margin-right: 1%; margin-bottom: 0.5em;">
              <br><br><label >INR ${fss.price} </label> <br> <label>${fss.name}</label> 
                   
            </a>
            </span>
            </td>
 
</tr>
 </c:forEach>
 
</table>
</body>
</html>