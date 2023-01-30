<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
	<form action="sms" method="post">
		<pre>
First Name <input type="text" name="fname" />
Last Name:<input type="text" name="lname" />
Gender:<input type="text" name="gender" />
Reason:<textarea rows="5" cols="" name="reason"></textarea>
Address:<textarea name="address"></textarea>
<input style="background-color: green" type="submit" value="Send" />
</pre>


	</form>

</body>
</html>