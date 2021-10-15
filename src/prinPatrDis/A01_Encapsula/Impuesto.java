package prinPatrDis.A01_Encapsula;

public class Impuesto {
	private String country;
	
	public Impuesto(String country) {
		this.country = country;
	}

	public double getImpuesto() {
		double impuesto;
		switch (country) {
		case "MX":
			impuesto = 0.16;
			break;
		case "US":
			impuesto = 0.07;
			break;
		case "EU":
			impuesto = 0.21;
			break;
		case "JP":
			impuesto = 0.10;
			break;
		default:
			impuesto = 0;
			break;
		}
		return impuesto;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
