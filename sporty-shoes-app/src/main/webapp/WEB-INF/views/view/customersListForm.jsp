<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" errorPage="Error.jsp" %>
 <%@ taglib  uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers Information</title>
<style>
table, td,th {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
 <%@include file="adminHeader.jsp" %>
<h1>Customers Information</h1> 

<table>
  <tr>
    <th>Firstname</th>
    <th>Lastname</th> 
    <th>Password</th>
    <th>Rollid</th>
    <th>PhNo</th> 
    <th>Email</th>
     
  </tr>
  <c:forEach items="${usersList}" var="fss">
   <tr>
    <td>${fss.firstname}</td>
    <td>${fss.lastname}</td>
    <td>${fss.password}</td>
    <td>${fss.rollid}</td>
    <td>${fss.phno}</td>
    <td>${fss.email}</td> 
  </tr>
  </c:forEach>
  
</table>
</body>
</html>