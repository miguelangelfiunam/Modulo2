package prinPatrDis.A03_Encapsula_Ejercicio;

public class Banco {
	private String nombreBanco;
	private double dinero;

	public Banco(String nombreBanco, double dinero) {
		this.nombreBanco = nombreBanco;
		this.dinero = dinero;
	}

	/**
	 * Metodo para convertir dinero de MXN a otro
	 * 
	 * @param valor
	 * @return
	 */
	public double convierteDineroMX(String pais) {
		double conversion = 0;
		switch (pais) {
		case "MX":
			conversion = this.dinero;
			break;
		case "JP":
			conversion = 5.62160 * this.dinero;
			break;
		case "EU":
			conversion = 0.042 * this.dinero;
			break;
		case "US":
			conversion = 0.049 * this.dinero;
			break;
		default:
			break;
		}
		return conversion;
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
