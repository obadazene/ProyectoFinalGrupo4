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
<link rel="stylesheet" href="resources/css/estilos.css">

<title>LISTADO DE USUARIOS</title>
</head>
<body>
	<div align="center">
		<h1>LISTADO DE USUARIOS</h1>
		<h3>
			<a href="new">Clic para crear un NUEVO USUARIO</a>
		</h3>

		<table border="1">
			<tr>
				<th>N�</th>
				<th>Nombre</th>
				<!--<th>Tel�fono</th>-->
				<!--<th>Provincia</th>-->
				<!--<th>Direcci�n</th>-->
			</tr>

			<c:forEach var="persona" items="${contactList}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${persona.nombre}</td>
					<!--<td>${persona.apellido1}</td>-->
					<!--<td>${persona.apellido2}</td>-->
					<!--<td>${persona.dni}</td>-->
					<!-- <td>${persona.fechanacimiento}</td> -->
					<td><a href="editPersona?id=${persona.idpersona}">Modificar</a>


						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delPersona?id=${persona.idpersona}">Eliminar</a>


						&nbsp;&nbsp;&nbsp;&nbsp;<a
						href="detailPersona?id=${persona.idpersona}">Detalle</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div align="center"width: 50px; height: 50px; >
		<img style="width: 200px; height: 100px;"
			src="https://nadandoporsonrisas.com/wp-content/uploads/2018/04/luca_tic_-_logos_formacion_y_seleccion-300x169.jpg">
	</div>
</body>
</html>