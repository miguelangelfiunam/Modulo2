package prinPatrDis.A03.Encapsula.Ejercicio;

public class Intercambio {
	private String pais;
	
	public Intercambio(String pais) {
		this.pais = pais;
	}

	public double intercambiaMX(double cantidad) {
		switch (pais) {
		case "MX":
			break;
		case "JP":
			cantidad = 5.62160 * cantidad;
			break;
		case "EU":
			cantidad = 0.042 * cantidad;
			break;
		case "US":
			cantidad = 0.049 * cantidad;
			break;
		default:
			break;
		}
		return cantidad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
