package com.ipartek.formacion.controller;

public class Constantes {

	private Constantes(){
		//con esto nadie me puede instanciar un objeto llamado constantes
	}
	public static final String ATT_LISTADO_PROFESORES = "listado-profesores";
	public static final String ATT_LISTADO_ALUMNOS = "listado-alumnos";
	public static final String ATT_MENSAJE = "mensaje";
	public static final String ATT_final = "alumno";
	
	public static final String SERVLET_ALUMNO = "alumno.do";
	public static final String SERVLET_PROFESOR = "profesor.do";
	
	public static final String JSP_LISTADO_ALUMNOS = "alumnos/listado.jsp";
	//public static final String JSP_CREAR_ALUMNO = "alumnos/alumno.jsp";
	public static final String JSP_LISTADO_PROFESORES="profesores/listado.jsp";
	public static final String JSP_HOME = "index.jsp";
	public static final String JSP_FORMULARIO_ALUMNO = "alumnos/alumno.jsp";
	public static final String JSP_FORMULARIO_PROFESOR = "profesores/profesor.jsp";
	
	public static final String PAR_OPERACION = "op";
	
	public static final int OP_CREATE = 1;
	public static final int OP_READ = 2;
	public static final int OP_UPDATE = 3;
	public static final int OP_DELETE = 4;

	//NOMBRES DE PARÁMETROS DE LA CLASE ALUMNOS:
	public static final String PAR_CODIGO = "codigo";
	public static final String PAR_NOMBRE = "nombre";
	public static final String PAR_APELLIDOS = "apellidos";
	public static final String PAR_DNI = "dni";
	//NOTA: en vista son todo texto, int. Pasa de fechas...
	public static final String PAR_FNACIMIENTO = "fNacimiento";
	public static final String PAR_DIRECCION = "direccion";
	public static final String PAR_EMAIL = "email";
	public static final String PAR_NHERMANOS = "nHermanos";
	public static final String PAR_ACTIVO = "activo";
	
	//NOMBRES DE PARÁMETROS DE LA CLASE PROFESOR:
	public static final String PAR_nSS = "nSS";

}
