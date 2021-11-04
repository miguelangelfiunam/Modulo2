package prinPatrDisEstructural.N03.ChainOfResponsability.EjercicioPermisos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Prueba de la aplicacion con validaciones
 */
public class Application {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Servidor servidor;

    private static void init() {
    	servidor = new Servidor();
    	servidor.register("admin@example.com", "qweQW12$");
    	servidor.register("user@example.com", "asdAS12@");
    	servidor.registerIp("10.0.0.7");
    	servidor.registerIp("132.248.39.148");
    	servidor.registerIp("132.56.98.12");
    	servidor.registerIp("245.36.98.145");

        // All checks are linked. Client can build various chains using the same
        // components.
        Validacion validacion = new ExisteIPValidacion(servidor);
        validacion
        .enlazaValidacion(new VerificaInyeccionValidacion())
        .enlazaValidacion(new ExisteUsuarioValidacion(servidor))
                .enlazaValidacion(new VerificaRolValidacion());

        // Server gets a chain from client code.
        servidor.setValidacion(validacion);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            System.out.print("IP: ");
            String ip = reader.readLine();
            success = servidor.ingreso(email, password, ip);
        } while (!success);
    }
}
