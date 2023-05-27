<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
</head>
<body>
<%@include file="homeHeader.jsp" %>
 
            <form action="adminsignin"  >  
            <hr>
          
           <h1>Enter your Credentials</h1>
            <b><font color="red">${errorMessage}</font></b>
           
         <h2> UserName <input type="text" name="username"  ></h2> 
          <h2>Password  <input  type="password" name="password"  ></h2> 
          <input type="submit" value="Signin">
 
           </form> 
          
</body>
</html>