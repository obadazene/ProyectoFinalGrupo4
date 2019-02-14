<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">


<spring:url value="resources/css/bootstrap.css" var="bootstrap" />
<link href="${bootstrap}" rel="stylesheet" />
<spring:url value="resources/css/custom.css" var="custom" />
<link href="${custom}" rel="stylesheet" />

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/custom.css">


<title>Añadir contactos</title>
</head>
<body background >
	<div align="center">
		<h1>Añadir contactos</h1>
		<br> <br> <br>

		<form:form action="/save" method="post" modelAttribute="persona">
			<table border=1>

				<form:hidden path="idpersona" />
				<tr>
					<td>Nombre:</td>

					<td><form:input path="nombre" /></td>
				</tr>
				<tr>
					<td>Primer apellido:</td>

					<td><form:input path="apellido1" /></td>
				</tr>
				<tr>
					<td>Segundo apellido:</td>

					<td><form:input path="apellido2" /></td>
				</tr>

				<tr>
					<td>DNI</td>

					<td><form:input path="dni" /></td>
				</tr>


				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Guardar Registro"></td>
				</tr>
			</table>
		</form:form>

	</div>

</body>
</html>