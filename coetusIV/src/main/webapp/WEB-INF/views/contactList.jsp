<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">

        <spring:url value="resources/css/bootstrap.css" var="bootstrap"/>
        <link href="${bootstrap}" rel="stylesheet" />
        <spring:url value="resources/css/custom.css" var="custom"/>
        <link href="${custom}" rel="stylesheet" />  

<title>LISTADO DE USUARIOS</title>
</head>
<body>
	<div align="center">
		<h1>LISTADO DE USUARIOS Repo</h1>
		<h3>
			<a href="new">Clic para crear un NUEVO USUARIO</a>
		</h3>

		<table border="1">
		<tr>
			<th>Nº</th>
			<th>Nombre</th>
			<th>Teléfono</th>
			<th>Provincia</th>
			<th>Dirección</th>
			</tr>

			<c:forEach var="user" items="${contactList}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${user.nombre}</td>
					<td>${user.apellido1}</td>
					<td>${user.apellido2}</td>
					<td>${user.dni}</td>
					<td>${user.fechanacimiento}</td>
					<td><a href="edit?id=${user.idpersona}">Modificar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=${user.idpersona}">Eliminar</a>
					</td>
				</tr>
			</c:forEach> 
		</table>
	</div>
</body>
</html>