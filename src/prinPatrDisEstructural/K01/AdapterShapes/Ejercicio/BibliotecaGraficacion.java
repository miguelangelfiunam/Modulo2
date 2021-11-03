package prinPatrDisEstructural.K01.AdapterShapes.Ejercicio;

public class BibliotecaGraficacion {
	private Json json;
	
	public BibliotecaGraficacion(Json json) {
		this.json = json;
	}

	public void realizaGrafica() {
		json.getDatos();
		System.out.println("Realizando grafica con datos JSON");
	}

	public Json getJson() {
		return json;
	}

	public void setJson(Json json) {
		this.json = json;
	}

}
