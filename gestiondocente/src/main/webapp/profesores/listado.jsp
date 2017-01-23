<%@page import="com.ipartek.formacion.controler.Constantes"%>
<%@page import="com.ipartek.formacion.dbms.pojo.Profesor"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<jsp:include page="../includes/header.jsp"/>


<div class="container">
		<h1>Página Listado Profesor</h1>
		<%
			/*esto es un criplet*/
			//recogemos el atributo de la request y lo gardamos en un objeto lista
			//hay q hacer un casting de request y decirle q es tipo list
			Map<Integer, Profesor > profesores =(Map<Integer, Profesor>) request.getAttribute(Constantes.ATT_LISTADO_PROFESORES); 
			//sacar la lista por pantalla	
		%>
		<br>
		<br>
		<a href="<%=Constantes.SERVLET_PROFESOR%>?<%=Constantes.PAR_OPERACION%>=<%=Constantes.OP_CREATE %>" class="btn btn-primary btn-lg active " role="button"> Crear Profesor</a>
		<ul>
		<br>
		<br>
		<% 
		for (Map.Entry<Integer, Profesor> entry : profesores.entrySet()) {
			 int codigo = entry.getKey();
			 Profesor profesor = entry.getValue();
			// out.println("<li>" + entry.getKey() + "  email=" + profesor.getEmail() + "</li>");
		    out.println("<li>"+ profesor.toString()+ " "
		    	+"<a href='"+Constantes.SERVLET_PROFESOR+"?"+Constantes.PAR_OPERACION+"="+Constantes.OP_UPDATE+"&"+Constantes.PAR_CODIGO+"="+profesor.getCodigo()+"' class='btn btn-warning btn-xs' role='button' >UPDATE</a>"
		   		+"<a href='"+Constantes.SERVLET_PROFESOR+"?"+Constantes.PAR_OPERACION+"="+Constantes.OP_DELETE+"&"+Constantes.PAR_CODIGO+"="+profesor.getCodigo()+"' class='btn btn-danger btn-xs' role='button' >Borrar</a>"+"</li>");	
		  //  out.write(entry.getValue().)
		  
		}
		
		%>
		</ul>
	</div>

<%@ include file="../includes/footer.html" %>
</body>
</html>