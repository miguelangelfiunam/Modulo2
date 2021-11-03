package prinPatrDisEstructural.N02.ChainOfResponsability.EjercicioComponentes;

public class Panel extends Contenedor {
	protected String modalTextoAyuda;
	
	protected String textoPanel;

	public Panel(String textoPanel) {
		this.textoPanel = textoPanel;
	}
	
	public void muestraAyuda() {
		// TODO Auto-generated method stub
		if(modalTextoAyuda != null) {
			System.out.println(modalTextoAyuda);
		}else {
			super.muestraAyuda();
		}

	}
}
