package prinPatrDisEstructural.K01.AdapterShapes.Ejercicio;

public class JsonAdaptador extends Xml{
	
	private Json json;
	
	public JsonAdaptador(Json json) {
		this.json = json;
	}

	public Xml getDatos() {
		json.getDatos();
		System.out.println("Convirtiendo datos JSON a formato XML");
		//Nuevo objeto XML con los datos del JSON
		return new Xml();
	}

}
