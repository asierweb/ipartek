<%@page import="com.ipartek.formacion.controller.Constantes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.ipartek.formacion.dbms.pojo.Profesor"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../includes/header.jsp"/>
<main>
	
		<a href="<%=Constantes.SERVLET_PROFESOR %>?<%=Constantes.PAR_OPERACION%>=<%=Constantes.OP_CREATE%>">Crear Profesor</a>
	
	<%
	/* Esto es un scriptlet */
   // Recogemos el atributo de la request
	
	Map<Integer,Profesor> profesores = (Map<Integer,Profesor>)request.getAttribute(Constantes.ATT_LISTADO_PROFESORES);

	for (Map.Entry<Integer, Profesor> entry : profesores.entrySet()) {
		int codigo = entry.getKey();
		Profesor profesor = entry.getValue();
		out.print("<li>" + profesor.toString() + "</li>");
		//out.write("<p>" + profesor.toString() + "</p>");
	}
	
	/* 
	// Otra manera de obtener una lista de un mapa
	List<Profesor>lista = new ArrayList<Profesor>(profesores.values());
	for(Profesor profesor:lista){
		out.print(profesor.toString());
		
	}
	*/
	%>
	</main>
<%@include file="../includes/footer.html" %>
</body>
</html>