package prinPatrDisEstructural.N03.ChainOfResponsability.EjercicioPermisos;

/**
 * ConcreteHandler. Verifica la simulación de inyección de código mediante una
 * expresión regular para el correo y el password, no se realiza conexión a base
 * de datos de lo contrario se podria relizar PreparedStatement con ingreso de
 * parametros mediante una consulta SQL con ? en lugar de los parametros de
 * entrada de correo y password
 */
public class VerificaInyeccionValidacion extends Validacion {

	@Override
	public boolean verificacion(String email, String password, String ip) {
		// TODO Auto-generated method stub
		if (!this.verificaEmail(email)) {
			System.out.println("Incorrect Email!");
			return false;
		}
		if (!this.verificaPassword(password)) {
			System.out.println("The password need contain: ");
			System.out.println("8 characters length ");
			System.out.println("2 letters in Upper Case ");
			System.out.println("1 Special Character (!@#$&*) ");
			System.out.println("2 numerals (0-9) ");
			System.out.println("3 letters in Lower Case ");

			return false;
		}
		return siguienteVerificacion(email, password, ip);
	}

	/**
	 * Metodo para validar un email evitando inyeccion de codigo mediante una
	 * expresión regular
	 * 
	 * @param email
	 * @return
	 */
	private boolean verificaEmail(String email) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		return email.matches(regex);
	}

	/**
	 * Metodo para validar un password evitando inyeccion de codigo mediante una
	 * expresión regular
	 * 
	 * @param password
	 * @return
	 */
	private boolean verificaPassword(String password) {
		// ^ Inicio
		// (?=.*[A-Z].*[A-Z]) Dos letras mayusculas
		// (?=.*[!@#$&*]) Un caracter especial
		// (?=.*[0-9].*[0-9]) Dos digitos de 0-9
		// (?=.*[a-z].*[a-z].*[a-z]) 3 letras minusculas
		// .{8} Longitud de 8 caracteres
		// $ Fin
		String regex = "^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$";
		return password.matches(regex);
	}

}