package prinPatrDis.A04.EncapsulaMetodo.Ejercicio;

public class Jugador {
	private String nombreJugador;
	private String nombrePersonaje;
	private double vida;
	private double ataque;
	private double ataqueEspecial;
	private boolean defensa;

	public Jugador(String nombreJugador, String nombrePersonaje) {
		this.nombreJugador = nombreJugador;
		this.nombrePersonaje = nombrePersonaje;
		this.vida = 100;
		this.ataque = 5;
		this.ataqueEspecial = 8;
		this.defensa = false;
	}

	public void iniciaPelea(Jugador j1, Jugador j2) {
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

	// Se encapsula el codigo de pelea en un metodo
	public void ataque(Jugador j1, Jugador j2) {
		if (!j2.defensa) {
			System.out.println(j1.getNombrePersonaje() + " golpea a " + j2.getNombrePersonaje());
			j2.setVida(j2.getVida() - j1.getAtaque());
		}
	}

	public String getNombrePersonaje() {
		return nombrePersonaje;
	}

	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public boolean isDefensa() {
		return defensa;
	}

	public void setDefensa(boolean defensa) {
		this.defensa = defensa;
	}

	public double getAtaqueEspecial() {
		return ataqueEspecial;
	}

	public void setAtaqueEspecial(double ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	@Override
	public String toString() {
		return "Jugador [nombreJugador=" + nombreJugador + ", nombrePersonaje=" + nombrePersonaje + ", vida=" + vida
				+ ", ataque=" + ataque + ", ataqueEspecial=" + ataqueEspecial + ", defensa=" + defensa + "]";
	}

}
