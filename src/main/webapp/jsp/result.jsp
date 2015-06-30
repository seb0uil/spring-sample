<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>

<form:form action="form2" modelAttribute="user" method="get"> 	
	<table>
		<tr>
			<td>nom:</td><td><form:input path="nom" size="100"/></td>
		</tr>
		
		<tr>
			<td>prenom:</td><td><form:input path="prenom" size="100"/></td>
		</tr>
		
		<tr>
			<td>email:</td><td><form:input path="email" size="100"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="Submit" />	
			</td>
		</tr>
	</table>
</form:form>

</body>
</html>