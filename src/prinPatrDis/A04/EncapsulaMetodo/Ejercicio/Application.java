package prinPatrDis.A04.EncapsulaMetodo.Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador j1 = new Jugador("Jugador 1", "Venom");
		Jugador j2 = new Jugador("Jugador 2", "Carnage");
		j1.iniciaPelea(j1, j2);
		j1.ataque(j1, j2);
		j1.ataque(j2, j1);
		j1.ataque(j1, j2);
		j1.iniciaPelea(j1, j2);
	}

}
