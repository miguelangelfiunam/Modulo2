package prinPatrDisEstructural.N03.ChainOfResponsability.EjercicioPermisos;

/**
 * ConcreteHandler. Determinar los permisos en la aplicación, es decir, a qué
 * puede entrar el usuario y a qué no.
 */
public class VerificaRolValidacion extends Validacion {

	@Override
	public boolean verificacion(String email, String password, String ip) {
		// TODO Auto-generated method stub
		if (email.equals("admin@example.com")) {
			System.out.println("Hello, admin! from " + ip);
			return true;
		}
		System.out.println("Hello, user!");
		return siguienteVerificacion(email, password, ip);
	}
}
