package prinPatrDis.C04.Composicion.Ejercicio;

public class Television {
	Resolucion resolucion;
	Tecnologia tecnologia;
	private double precio;
	
	public Television(Resolucion resolucion, Tecnologia tecnologia) {
		this.resolucion = resolucion;
		this.tecnologia = tecnologia;
	}

	public void comprar() {
		System.out.print("Comprando Television con ");
		tecnologia.obtenerTecnologia();
		System.out.print(" y ");
		resolucion.obtenerResolucion();
		precio = tecnologia.obtenerPrecioTecnologia() + resolucion.obtenerPrecioResolucion();
		System.out.print(" Total: $" + precio);
	}
}
