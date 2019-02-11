<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">


        <spring:url value="resources/css/bootstrap.css" var="bootstrap"/>
        <link href="${bootstrap}" rel="stylesheet" />
        <spring:url value="resources/css/custom.css" var="custom"/>
        <link href="${custom}" rel="stylesheet" />  
        
        <!-- Static content -->
		<link rel="stylesheet" href="/resources/css/custom.css">

        
<title>FORMULARIO DE USUARIOS Repo</title>
</head>
<body>
	<div align="center">
		<h1>FORMULARIO DE USUARIOS Repo (add/edit)</h1>
		<table>
			<form:form action="save" method="post" modelAttribute="persona">
				<form:hidden path="id" />
				<tr>
					<td>Nombre:</td>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<td>Teléfono:</td>
					<td><form:input path="phone" /></td>
				</tr>
				<tr>
					<td>Provincia:</td>
					<td><form:password path="state" /></td>
				</tr>
				<tr>
					<td>Dirección:</td>
					<td><form:password path="address" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Guardar Registro"></td>
				</tr>
			</form:form>
		</table>
	</div>

</body>
</html>