package prinPatrDisEstructural.N03.ChainOfResponsability.EjercicioPermisos;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
public class ExisteUsuarioValidacion extends Validacion {
    private Servidor servidor;

    public ExisteUsuarioValidacion(Servidor servidor) {
        this.servidor = servidor;
    }
    
    @Override
    public boolean verificacion(String email, String password, String ip) {
    	// TODO Auto-generated method stub
        if (!servidor.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!servidor.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return siguienteVerificacion(email, password, ip);
    }
}