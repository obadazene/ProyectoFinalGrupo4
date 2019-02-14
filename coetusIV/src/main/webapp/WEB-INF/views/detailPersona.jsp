<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	
	<spring:url value="resources/css/bootstrap.css" var="bootstrap" />
	<link href="${bootstrap}" rel="stylesheet" />
	<spring:url value="resources/css/custom.css" var="custom" />
	<link href="${custom}" rel="stylesheet" />

<title>Detalle de persona</title>
</head>
<body>
	<div align="center">

		<h1>Vista detallada de ${persona.nombre}</h1>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Primer Apellido</th>
				<th>Segundo Apellido</th>
				<th>Dni</th>
			</tr>

			<tr>
				<th>${status.index + 1}</th>
				<th>${persona.nombre}</th>
				<th>${persona.apellido1}</th>
				<th>${persona.apellido2}</th>
				<th>${persona.dni}</th>

			</tr>


		</table>

	</div>
	<br>
	<br>
	<div align="center">
		<a href="lista">Volver a la lista</a>
	</div>
</body>
</html>