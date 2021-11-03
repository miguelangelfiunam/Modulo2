package prinPatrDisEstructural.N02.ChainOfResponsability.EjercicioComponentes;

public class Panel extends Contenedor {
	protected String modalAyuda;

	// posicion en x
	protected int posX;
	// posicion en y
	protected int posY;
	// |
	// |
	protected int largo;
	// ------
	protected int alto;

	public Panel(int posX, int posY, int largo, int alto) {
		this.posX = posX;
		this.posY = posY;
		this.largo = largo;
		this.alto = alto;
	}

	public void muestraAyuda() {
		// TODO Auto-generated method stub
		if (modalAyuda != null) {
			System.out.println(modalAyuda);
		} else {
			super.muestraAyuda();
		}

	}
	
	public Componente obtenerComponentePanel(int posXCursor, int posYCursor) {
		// TODO Auto-generated method stub
		if (posXCursor >= posX && posXCursor <= (posX + largo)) {
			if (posYCursor >= posY && posYCursor <= (posY + alto)) {
				return this;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Panel [posX=" + posX + ", posY=" + posY + ", largo=" + largo + ", alto=" + alto + "]";
	}
}
