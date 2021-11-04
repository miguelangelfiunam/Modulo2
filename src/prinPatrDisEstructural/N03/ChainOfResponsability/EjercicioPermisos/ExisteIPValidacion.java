package prinPatrDisEstructural.N03.ChainOfResponsability.EjercicioPermisos;

/**
 * ConcreteHandler. Verifica que la ip de entrada tenga acceso a la aplicacion
 * se pretende que en la vida real se pueda obtener de manera automatica la ip
 * para poder verificar las ip de acceso
 */
public class ExisteIPValidacion extends Validacion {
	private Servidor servidor;

	public ExisteIPValidacion(Servidor servidor) {
		this.servidor = servidor;
	}

	@Override
	public boolean verificacion(String email, String password, String ip) {
		// TODO Auto-generated method stub
		if (!servidor.isValidIp(ip)) {
			System.out.println("Invalid IP!");
			return false;
		}
		return siguienteVerificacion(email, password, ip);
	}
}