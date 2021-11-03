package prinPatrDisEstructural.N02.ChainOfResponsability.EjercicioComponentes;

public abstract class Componente implements ComponenteConAyuda {
	protected String tooltipTextoAyuda;

	protected Contenedor contenedor;

	@Override
	public void muestraAyuda() {
		// TODO Auto-generated method stub
		if (tooltipTextoAyuda != null) {
			System.out.println(tooltipTextoAyuda);
		} else {
			contenedor.muestraAyuda();
		}

	}
	
	public abstract Componente obtenerComponente(int posXCursor, int posYCursor);

}
