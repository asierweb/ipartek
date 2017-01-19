package com.ipartek.formacion.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.dbms.pojo.Alumno;
import com.ipartek.formacion.dbms.pojo.exceptions.PersonaException;
import com.ipartek.formacion.service.AlumnoService;
import com.ipartek.formacion.service.AlumnoServiceImp;

/**
 * Servlet implementation class AlumnoServlet
 */
public class AlumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AlumnoService aS;
	private RequestDispatcher rd;
	
	/**
	 * El servlet se ejecuta el solo por eso no se usa el constructor.
	 * El metodo init() le dice que hacer al iniciar el Servlet como si
	 * fuera un constructor
	 */
	@Override
	public void init() throws ServletException {
		/*
		 * En los servlet se programa antes de la llamada al padre porque 
		 * cuando se llama al padre se sale.
		 * Se inicializa AlumnoServiceImp que tiene los metodos CRUD
		 * Solo necesito un objeto aS para este servlet
		 */
		aS = new AlumnoServiceImp();
		super.init();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recogemos el parametro
		String operacion = request.getParameter(Constantes.PAR_OPERACION);
		int op = -1;
		try{
			//Hacer parse a int
			op = Integer.parseInt(operacion);
			//Switch para gestionar que hacer
			switch(op){
				case Constantes.OP_CREATE:
				//Se va a redirigir a la pagina alumnos/alumno.jsp
				rd = request.getRequestDispatcher("alumnos/alumno.jsp");
				break;
				case Constantes.OP_READ:
				cargarListaAlumnos(request);
				break;
				case Constantes.OP_UPDATE:
				//TODO recogemos el codigo para coger el getById
				//request.getParameter()
				//Se va a redirigir a la pagina alumnos/alumno.jsp
				rd = request.getRequestDispatcher("alumnos/alumno.jsp");
				//request.setAtribute(arg0, arg1);
				break;
				case Constantes.OP_DELETE:
					
				break;
				default:
					
				break;
			}
		}catch(Exception e){
			//cargarListaAlumnos(request);
			response.sendRedirect(Constantes.JSP_HOME);
			return;
		}
		// Hace la redireccion
		rd.forward(request, response);
	}

	/**
	 * @param request
	 */
	private void cargarListaAlumnos(HttpServletRequest request) {
		// Obtenemos los datos de los alumnos y los cargamos en la variable alumnos
		List<Alumno> alumnos = aS.getAll();
		// Fijamos la pagina de destino
		rd = request.getRequestDispatcher(Constantes.JSP_LISTADO_ALUMNOS);
		/*
		 * listado-alumno es una key
		 * Y alumno es el objeto lista
		 * request lo manda a la VISTA
		 *  Añadimos el atributo a la request(peticion)
		 */
		request.setAttribute(Constantes.ATT_LISTADO_ALUMNOS, alumnos);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Alumno alumno = null;
		//Recogemos los parametros
		String mensaje ="";
		try {
			alumno = recogerParametros(request);
			//procesaremos UPDATE or INSERT
			//Si el codigo de alumno es mayor que el codigo de alumno
			if(alumno.getCodigo() > Alumno.CODIGO_NULO){
				aS.update(alumno);
				mensaje = "El alumno ha sido actualizado correctamente";
			}else{ 
				aS.create(alumno);
				mensaje = "El alumno ha sido creado correctamente";
			}
		} catch (Exception e) {
			//Prepara la redireccion
			rd = request.getRequestDispatcher("alumnos/alumno.jsp");
			mensaje = e.getMessage();
		}
		request.setAttribute("mensaje", mensaje);
		rd.forward(request, response);
	}
	
	
	private Alumno recogerParametros(HttpServletRequest request) throws Exception {
		Alumno alumno = new Alumno();
		try{
			alumno.setCodigo(Integer.parseInt(request.getParameter(Constantes.PAR_CODIGO)));
			alumno.setNombre(request.getParameter(Constantes.PAR_NOMBRE));
			alumno.setApellidos(request.getParameter(Constantes.PAR_APELLIDOS));
			alumno.setDni(request.getParameter(Constantes.PAR_DNI));
			alumno.setEmail(request.getParameter(Constantes.PAR_EMAIL));
			alumno.setDireccion(request.getParameter(Constantes.PAR_DIRECCION));
			alumno.setnHermanos(Integer.parseInt(request.getParameter(Constantes.PAR_NHERMANOS)));
			alumno.setActivo(Boolean.parseBoolean(request.getParameter(Constantes.PAR_ACTIVO)));
			String date = request.getParameter(Constantes.PAR_FNACIMIENTO);
			String pattern = "dd/MM/yyyy";
			SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
			alumno.setfNacimiento(dateFormat.parse(date));
		}catch(Exception e){
			throw new Exception("Los datos no son validos");
		}
		return alumno;
	}

	//Solo para peticiones de formularios
	@Override
	public void destroy() {
		aS = null;
		super.destroy();
	}
}
