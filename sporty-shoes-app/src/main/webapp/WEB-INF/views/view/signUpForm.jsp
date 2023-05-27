<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>

<%@include file="homeHeader.jsp" %>

<hr>
 <form name="adduserform" action="signupnewuser"  onsubmit="return addFlightvalidateForm()">
       <h3>Create your Account</h3><br>
      First Name : <input type="text" name="firstname" ><br><br>
      Last Name : <input type="text" name="lastname" ><br><br>
      Password : <input type="text" name="password" ><br><br>
     Confirm Password : <input type="text" name="confirmpassword" ><br><br>
     Roll :  <div><input type="radio" id="admin" name="roll" value="admin">
  <label for="admin">Admin</label><br>
  <input type="radio" id="user" name="roll" value="user">
  <label for="user">User</label> </div><br><br>
      Mobile No : <input  type="text" name="mobileno" ><br><br>
      Email : <input  type="text" name="email" ><br><br>
      <input type="submit" class="buttonstyle"  value="SignUp">
      </form>
</body>
<script type="text/javascript">
function addFlightvalidateForm() {
	   
	  var firstname = document.forms["adduserform"]["firstname"].value;
	  var lastname = document.forms["adduserform"]["lastname"].value;
	  var password = document.forms["adduserform"]["password"].value;
	  var confirmpassword = document.forms["adduserform"]["confirmpassword"].value;
	  var roll = document.forms["adduserform"]["roll"].value;
	  var mobileno = document.forms["adduserform"]["mobileno"].value;
	  var email = document.forms["adduserform"]["email"].value;
	   
	  
	  if (firstname == "") {
		    alert("firstname must be filled out");
		    return false;
		  }
	  if (lastname == "") {
		    alert("lastname must be filled out");
		    return false;
		  }
	  if (password == "") {
		    alert("password must be filled out");
		    return false;
		  }
		  if (confirmpassword == "") {
			    alert("confirmpassword must be filled out");
			    return false;
			  }
		  if (roll == "") {
			    alert("roll must be filled out");
			    return false;
			  }
		  if (mobileno == "") {
			    alert("mobileno must be filled out");
			    return false;
			  }
		  if (email == "") {
			    alert("email must be filled out");
			    return false;
			  }	  
	  
	}
</script>
</html>