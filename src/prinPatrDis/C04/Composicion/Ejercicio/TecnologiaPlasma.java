package prinPatrDis.C04.Composicion.Ejercicio;

public class TecnologiaPlasma implements Tecnologia {
	private final double precioTecnologia = 95;
	@Override
	public void obtenerTecnologia() {
		// TODO Auto-generated method stub
		System.out.print("Tecnologia de plasma");
	}
	@Override
	public double obtenerPrecioTecnologia() {
		// TODO Auto-generated method stub
		return precioTecnologia;
	}

}
