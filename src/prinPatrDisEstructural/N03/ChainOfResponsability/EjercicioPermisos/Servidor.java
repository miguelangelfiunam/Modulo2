package prinPatrDisEstructural.N03.ChainOfResponsability.EjercicioPermisos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Server class.
 */
public class Servidor {
    private Map<String, String> users = new HashMap<>();
    private List<String> ips = new ArrayList<>();
    private Validacion validacion;

    /**
     * Client passes a chain of object to server. This improves flexibility and
     * makes testing the server class easier.
     */
    public void setValidacion(Validacion validacion) {
        this.validacion = validacion;
    }

    /**
     * Server gets email and password from client and sends the authorization
     * request to the chain.
     */
    public boolean ingreso(String email, String password, String ip) {
        if (validacion.verificacion(email, password, ip)) {
            System.out.println("Authorization have been successful!");

            // Do something useful here for authorized users.

            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
    
    public void registerIp(String ip) {
    	ips.add(ip);
    }
    
    public boolean isValidIp(String ip) {
    	boolean existe = false;
    	for (String string : ips) {
			if(string.equals(ip)) {
				existe = true;
				break;
			}
		}
    	return existe;
    }
}
