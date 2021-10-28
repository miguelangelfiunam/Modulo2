package prinPatrDis.C04.Composicion.Ejercicio;

public class TecnologiaLCD implements Tecnologia {
	private final double precioTecnologia = 150;
	@Override
	public void obtenerTecnologia() {
		// TODO Auto-generated method stub
		System.out.print("Tecnologia LCD");
	}
	@Override
	public double obtenerPrecioTecnologia() {
		// TODO Auto-generated method stub
		return precioTecnologia;
	}

}
