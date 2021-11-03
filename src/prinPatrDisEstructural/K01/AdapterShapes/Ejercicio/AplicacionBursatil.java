package prinPatrDisEstructural.K01.AdapterShapes.Ejercicio;

public class AplicacionBursatil {
	private Xml xml;
	
	public AplicacionBursatil() {
		xml = new Xml();
	}

	public Xml devuelveAccionesBursatiles() {
		return xml;
	}

	public void setXml(Xml xml) {
		this.xml = xml;
	}
	
}
