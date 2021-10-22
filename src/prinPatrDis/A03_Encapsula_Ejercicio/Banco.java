package prinPatrDis.A03_Encapsula_Ejercicio;

public class Banco {
	private String nombreBanco;
	private double dinero;
	private Intercambio intercambio;

	public Banco(String nombreBanco, double dinero, String intercambioPais) {
		this.nombreBanco = nombreBanco;
		this.dinero = dinero;
		this.intercambio = new Intercambio(intercambioPais);
	}

	/**
	 * Metodo para convertir dinero de MXN a otro
	 * 
	 * @param valor
	 * @return
	 */
	public double convierteDineroMX() {
		return intercambio.intercambiaMX(dinero);
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "Banco [nombreBanco=" + nombreBanco + ", dinero=" + dinero + "]";
	}

}
