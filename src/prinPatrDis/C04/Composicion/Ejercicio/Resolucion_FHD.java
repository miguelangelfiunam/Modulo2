package prinPatrDis.C04.Composicion.Ejercicio;

public class Resolucion_FHD implements Resolucion {
	private final double precioResolucion = 236;
	
	@Override
	public void obtenerResolucion() {
		// TODO Auto-generated method stub
		System.out.print("Resolucion FHD");
	}
	
	@Override
	public double obtenerPrecioResolucion() {
		// TODO Auto-generated method stub
		return precioResolucion;
	}

}
