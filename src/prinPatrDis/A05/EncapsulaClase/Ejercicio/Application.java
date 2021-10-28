package prinPatrDis.A05.EncapsulaClase.Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador j1 = new Jugador("Jugador 1", "Venom");
		Jugador j2 = new Jugador("Jugador 2", "Carnage");
		Pelea pelea = new Pelea();
		pelea.imprimeAvancePelea(j1, j2);
		pelea.ataque(j1, j2);
		pelea.ataque(j2, j1);
		pelea.ataque(j1, j2);
		pelea.imprimeAvancePelea(j1, j2);
	}

}
