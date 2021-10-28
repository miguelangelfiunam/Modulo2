package prinPatrDis.A05.EncapsulaClase.Ejercicio;

public class Pelea {
	public void imprimeAvancePelea(Jugador j1, Jugador j2) {
		for (int i = 0; i < (int) j1.getVida(); i++) {
			if (i % 10 == 0) {
				System.out.print("=");
			}
		}
		System.out.print(" HP ");
		for (int j = 0; j < (int) j2.getVida(); j++) {
			if (j % 10 == 0) {
				System.out.print("=");
			}
		}
		System.out.println("\n" + (int) j1.getVida() + " " + j1.getNombrePersonaje() + " vs " + (int) j2.getVida() + " "
				+ j2.getNombrePersonaje());
	}

	/**
	 * Simulacion de ataque por parte del jugador j1 hacia j2
	 * 
	 * @param j1 Jugador que pega
	 * @param j2 Jugador que recibe daño
	 */
	public void ataque(Jugador j1, Jugador j2) {
		if (!j2.isDefensa()) {
			System.out.println(j1.getNombrePersonaje() + " golpea a " + j2.getNombrePersonaje());
			j2.setVida(j2.getVida() - j1.getAtaque());
		}
	}
}
