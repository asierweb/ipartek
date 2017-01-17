/* Paquete donde se guardan las entidades. */
package com.ipartek.formacion.dbms.pojo;
/**
 * 
 * @author Urko Villanueva
 * @author Raúl de Roba 17/01/17 (Añadido de comentarios.)
 * 
 * Clase de la entidad profesor (Heredada de la clase persona).
 *
 */
public class Profesor extends Persona {
	/* Constate para valores nulos. Se asigna -1 asumiendo que no se ha introducido 
	 * valor reseñable.ningún*/
	public static final int CODIGO_NULO = -1;
	/* Atributos personalizados de la clase 'Profesor'. */
	private int nSS;
	private int codigo;

	/* Constructor sin parametros de la clase 'Profesor'. */
	public Profesor() {
		/* Constructor de la clase padre. */
		super();
		/* Se asigna el valor nulo. (Recogido de la constante de clase.)*/
		this.codigo = CODIGO_NULO;
		/* Se inicializa el numero de la S.S.*/
		this.nSS = 0;
	}

	/* Getter del atributo 'NSS'.*/
	public int getnSS() {
		/* Se devuelve el numero de la seguridad social.*/
		return nSS;
	}

	/* Setter del atributo 'NSS'.*/
	public void setnSS(int nSS) {
		/* Se asigna la seguridad social.*/
		this.nSS = nSS;
	}

	/* Getter del atributo */
	public int getCodigo() {
		/* Se devuelde el codigo.*/
		return codigo;
	}
	
    /* Setter del atributo 'codigo'. */
	public void setCodigo(int codigo) {
		/* Se asigna el codigo. */
		this.codigo = codigo;
	}

}
