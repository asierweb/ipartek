package com.ipartek.formacion.controler;
/**
 * Cuando es un metodo statico el constructor es private,
 * nadie me puede instanciar un objeto de tipo constantes
 * @author Mai
 *
 */
public final class Constantes {
	
	public static final String ATT_LISTADO_PROFESORES = "listadoProfesor";
	public static final String ATT_LISTADO_ALUMNOS = "listadoAlumno";
	public static final String ATT_LISTADO_USUARIOS = "listadoUsuario";
	public static final String ATT_LISTADO_CURSOS = "listadoCurso";
	public static final String ATT_MENSAJE = "mensaje";
	public static final String ATT_ALUMNO = "alumno";
	public static final String ATT_PROFESOR = "profesor";
	public static final String ATT_CURSO = "curso";
	
	public static final String ATT_SESISON = "session";
	
	public static final String CTX_LISTADO_USUARIOS = "listadoUsuario";
	
	public static final String SESSION_IDIOMA = "language";
	public static final String SESSION_PERSONA = "persona";
	
	public static final String SERVLET_ALUMNO ="alumno.do";
	public static final String SERVLET_PROFESOR ="profesor.do";
	public static final String SERVLET_CURSO ="curso.do";
	public static final String SERVLET_IDIOMA ="idioma.do";
	public static final String SERVLET_LOGIN ="login.do";
	
	public static final String JSP_LISTADO_ALUMNOS="alumnos/listado.jsp";
	public static final String JSP_CREAR_ALUMNOS="alumnos/alumno.jsp";
	public static final String JSP_CREAR_CURSO="cursos/curso.jsp";
	public static final String JSP_LISTADO_CURSO="cursos/listado.jsp";
	public static final String JSP_CREAR_PROFESOR="profesores/profesor.jsp";
	public static final String JSP_LISTADO_PROFESORES="profesores/listado.jsp";
	public static final String JSP_LISTADO_USUARIOS="usuarios/listado.jsp";
	public static final String JSP_HOME = "index.jsp";
	
	public static final String PAR_OPERACION ="op";

	//nombre de parametros de la clase alumno
	public static final String PAR_CODIGO = "codigo";
	public static final String PAR_NOMBRE = "nombre";
	public static final String PAR_APELLIDO = "apellido";
	public static final String PAR_DNI = "dni";
	public static final String PAR_FNACIMIENTO = "fNacimiento";
	public static final String PAR_DIRECCION = "direccion";
	public static final String PAR_EMAIL = "email";
	public static final String PAR_NHERMANOS = "nHermanos";
	public static final String PAR_ACTIVO = "activo";
	public static final String PAR_NSS = "nSS";
	public static final String PAR_IDIOMA = "idioma";
	//para el login 
	public static final String PAR_PASSWORD="password";
	public static final String PAR_USUARIO="user";
	//nombre parametros de la clase curso
	public static final String PAR_DURACION = "duracion";
	public static final String PAR_FINICIO = "fInicio";
	public static final String PAR_FFIN = "fFin";
	
	public static final int IDIOMA_EUSKERA =1;
	public static final int IDIOMA_CASTELLANO = 2;
	public static final int IDIOMA_INGLES = 3;

	public static final int OP_CREATE =1;
	public static final int OP_READ = 2;
	public static final int OP_UPDATE = 3;
	public static final int OP_DELETE = 4;
	public static final int OP_CERRAR_SESION = 5;
	public static final int OP_LISTAR_USUARIOS_SESION = 6;
	
	
	private Constantes() {
		
	}
	
	
}