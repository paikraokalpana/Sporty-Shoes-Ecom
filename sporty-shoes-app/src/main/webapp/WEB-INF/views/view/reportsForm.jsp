<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" errorPage="Error.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reports</title>
<style>
table, td,th {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>

</head>
<body>
	<%@include file="adminHeader.jsp"%>
	<h1>Sales Report</h1>
	<form action="requiredreports" name="searchform"
		onsubmit="return reportvalidateForm()">
		<b><label for="categeory">Choose a Category:</label></b> <select
			name="categeory" id="categeory">
			<option value="mens">Mens Wear</option>
			<option value="womens">Womens Wear</option>
			<option value="kids">Kids Wear</option>

		</select><b> <label for="categeory">Select Date:</label> </b><input type="date"
			name="date"> <input type="submit" value="Done">
		<hr>
	</form>


	<table>
		<tr>
			<th>Orderid</th>
			<th>Shoeid</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Totalprice</th>
			<th>Categeory</th>
			<th>Date</th>
		</tr>
		<c:forEach items="${orderedShoeList}" var="fss">
			<tr>
				<td>${fss.orderid}</td>
				<td>${fss.shoeid}</td>
				<td><a>${fss.name}</a></td>
				<td>${fss.price}</td>
				<td><a>${fss.quantity}</a></td>
				<td><a>${fss.totalprice}</a></td>
				<td>${fss.categeory}</td>
				<td><a>${fss.date}</a></td>

			</tr>
		</c:forEach>
	</table>
	<h1 >Total Sales=  ${totalSales}</h1> 
</body>
<script type="text/javascript">
	function reportvalidateForm() {
		var date = document.forms["searchform"]["date"].value;

		if (date == "") {
			alert("Date must be select");
			return false;
		}

	}
</script>

</html>