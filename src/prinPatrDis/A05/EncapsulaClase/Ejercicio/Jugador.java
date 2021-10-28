package prinPatrDis.A05.EncapsulaClase.Ejercicio;
//Se crea una clase pelea, separado del jugador donde se verá el avance de la pelea
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
