package prinPatrDisEstructural.N02.ChainOfResponsability.EjercicioComponentes;

public class Ventana extends Contenedor {

	protected String urlAyuda;

	private String textoVentana;

	public Ventana(String textoVentana) {
		this.textoVentana = textoVentana;
	}

	public void muestraAyuda() {
		// TODO Auto-generated method stub
		if (urlAyuda != null) {
			System.out.println("Enviando a página de ayuda");
			System.out.println(urlAyuda);
		} else {
			super.muestraAyuda();
		}

	}
}
