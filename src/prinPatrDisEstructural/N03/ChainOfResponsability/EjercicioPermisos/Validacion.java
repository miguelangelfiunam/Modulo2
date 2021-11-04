package prinPatrDisEstructural.N03.ChainOfResponsability.EjercicioPermisos;

/**
 * Clase que sirve como base para realizar distintos tipos de validacion
 * 
 * @author Java
 *
 */
public abstract class Validacion {
	private Validacion siguienteValidacion;

	/**
	 * Realiza las cadenas de responsabilidad de diferentes validaciones
	 * 
	 * @param siguienteValidacion
	 * @return
	 */
	public Validacion enlazaValidacion(Validacion siguienteValidacion) {
		this.siguienteValidacion = siguienteValidacion;
		return siguienteValidacion;
	}

	/**
	 * Metodo abstracto donde si se hereda ese metodo si la clase se hereda
	 * 
	 * @param email
	 * @param password
	 * @param ip
	 * @return
	 */
	public abstract boolean verificacion(String email, String password, String ip);

	/**
	 * Ejecucion de el siguiente objeto en la cadena de responsabilidades
	 * 
	 * @param email
	 * @param password
	 * @param ip
	 * @return
	 */
	protected boolean siguienteVerificacion(String email, String password, String ip) {
		if (siguienteValidacion == null) {
			return true;
		}
		return siguienteValidacion.verificacion(email, password, ip);
	}
}
