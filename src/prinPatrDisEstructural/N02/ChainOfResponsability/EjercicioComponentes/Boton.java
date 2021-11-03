package prinPatrDisEstructural.N02.ChainOfResponsability.EjercicioComponentes;

public class Boton extends Componente {
	protected String textoBtn;

	// posicion en x
	protected int posX;
	// posicion en y
	protected int posY;
	// |
	// |
	protected int largo;
	// ------
	protected int alto;

	public Boton(int posX, int posY, int largo, int alto, String textoBtn) {
		this.posX = posX;
		this.posY = posY;
		this.largo = largo;
		this.alto = alto;
		this.textoBtn = textoBtn;
	}

	@Override
	public Componente obtenerComponente(int posXCursor, int posYCursor) {
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
		return "Boton [textoBtn=" + textoBtn + ", posX=" + posX + ", posY=" + posY + ", largo=" + largo + ", alto="
				+ alto + "]";
	}
	
	
}
