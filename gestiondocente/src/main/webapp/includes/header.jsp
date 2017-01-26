<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="com.ipartek.formacion.controler.Constantes"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<fmt:setLocale value="${language}" />
<fmt:setBundle basename="com.ipartek.formacion.controler.i18nmesages" /> 


<!DOCTYPE html>
<html lang="${language}">
<head>
<meta charset="UTF-8" >
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link href="<c:url value="css/bootstrap.min.css" />" rel="stylesheet" media="screen">

<link href="<c:url value="css/style.css" />" rel="stylesheet" media="screen">  
<link rel="icon" href="images/favicon.ico">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 <!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="js/bootstrap.min.js" />"></script>
<title>Inicio-Gestión</title>
</head>
<body>

<header>
<div id="header">
	<h1>Gestión Docente</h1>
</div>
	<nav class=" navbar-fixed-top" role="navigation" >
		<ul class="nav navbar-nav">
			<li><a href="<%=Constantes.SERVLET_IDIOMA %>?<%=Constantes.PAR_IDIOMA%>=<%=Constantes.IDIOMA_CASTELLANO%>">Castellano</a></li>
			<li><a href="<%=Constantes.SERVLET_IDIOMA %>?<%=Constantes.PAR_IDIOMA%>=<%=Constantes.IDIOMA_EUSKERA%>">Euskera</a></li>
			<li><a href="<%=Constantes.SERVLET_IDIOMA %>?<%=Constantes.PAR_IDIOMA%>=<%=Constantes.IDIOMA_INGLES%>">Ingles</a></li>
		</ul>
	</nav>
	<nav class="navbar navbar-default">
		<ul class="nav navbar-nav">
			<li>
				<a href="<%=Constantes.SERVLET_ALUMNO%>?<%=Constantes.PAR_OPERACION%>=<%=Constantes.OP_READ %>" class="btn btn-info">Listado de Alumnos</a>
			</li>
			<li>
				<a href="<%=Constantes.SERVLET_PROFESOR%>?<%=Constantes.PAR_OPERACION%>=<%=Constantes.OP_READ %>" class="btn btn-info">Listado de Profesores</a>
			</li>
			<li>
				<a href="<%=Constantes.SERVLET_CURSO%>?<%=Constantes.PAR_OPERACION%>=<%=Constantes.OP_READ %>" class="btn btn-info">Listado de Cursos</a>
			</li>
		</ul>
	</nav>
	
	<jsp:include page="mensajes.jsp"/>
	
</header>
