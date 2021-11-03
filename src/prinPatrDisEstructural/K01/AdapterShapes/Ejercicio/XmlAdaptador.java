package prinPatrDisEstructural.K01.AdapterShapes.Ejercicio;

public class XmlAdaptador extends Json{
	
	private Xml xml;
	
	public XmlAdaptador(Xml xml) {
		this.xml = xml;
	}

	public Json getDatos() {
		xml.getDatos();
		System.out.println("Convirtiendo datos a formato JSON");
		//Nuevo objeto JSON con los datos del XML
		return new Json();
	}

}
