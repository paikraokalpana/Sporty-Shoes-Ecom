<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" errorPage="Error.jsp"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Shoe</title>
</head>
<body>

<%@include file="homeHeader.jsp" %>
 
<form action="bookandpaymentreturntoHome">
<input type="hidden" name="imglink" value="${orderedshoemodel.imagelink}" />
<img  src="${orderedshoemodel.imagelink}" style="float: left; width: 20%; margin-right: 1%; margin-bottom: 0.5em;" > 


<input type="hidden" name="name"  value="${orderedshoemodel.name}"  />
<label><h1>${orderedshoemodel.name}</h1></label>

<input type="hidden" name="id" value="${orderedshoemodel.shoeid}"  />
<b>Product Id :<label >${orderedshoemodel.shoeid}</label></b> <br>

<input type="hidden" name="categeory"  value="${orderedshoemodel.categeory}"  />
<b>Categeroy :<label  >${orderedshoemodel.categeory}</label></b> <br>


<input type="hidden" name="price"  value="${orderedshoemodel.price}"  />
<h3>Price :<label  >${orderedshoemodel.price}</label> </h3><br>

<input type="hidden" name="quantity" value="${orderedshoemodel.quantity}"  />
 <b>Quantity :<label  >${orderedshoemodel.quantity}</label> </b> <br>
 
 
 <input type="hidden" name="totalprice"  value="${orderedshoemodel.totalprice}"  />
 <h2>Total Price :<label  >${orderedshoemodel.totalprice}</label> </h2> <br><br>
 
 
 <input type="submit" value="Book Order">
 
</form>
</body>
</html>