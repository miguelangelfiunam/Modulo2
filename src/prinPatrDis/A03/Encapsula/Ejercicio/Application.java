package prinPatrDis.A03.Encapsula.Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador j1 = new Jugador("Jugador 1", "Sub zero");
		Jugador j2 = new Jugador("Jugador 2", "Sub zero 2");
		j1.iniciaPelea(j1, j2);
		j1.iniciaPelea(j1, j2);
		j1.iniciaPelea(j2, j1);
	}

}
