package prinPatrDis.C04.Composicion.Ejercicio;

public class Resolucion_HD implements Resolucion {
	private final double precioResolucion = 123;

	@Override
	public void obtenerResolucion() {
		// TODO Auto-generated method stub
		System.out.print("Resolucion HD");
	}

	@Override
	public double obtenerPrecioResolucion() {
		// TODO Auto-generated method stub
		return precioResolucion;
	}

}
