package prinPatrDisEstructural.N02.ChainOfResponsability.EjercicioComponentes;

public class Application {
	static Ventana ventana;

	public static void creaVentana() {
		ventana = new Ventana("Formulario");
		ventana.urlAyuda = "www.ayudame.com";
		Panel panel = new Panel(0, 0, 400, 800);
		panel.modalAyuda = "Este panel registra usuario y contraseña";

		Boton aceptar = new Boton(250, 760, 50, 20, "Aceptar");
		aceptar.tooltipTextoAyuda = "Al dar clic te mueres";
		Boton cancelar = new Boton(320, 760, 50, 20, "Cancelar");

		Boton cerrar = new Boton(400, 800, 50, 20, "X");
		panel.agregaHijo(aceptar);
		panel.agregaHijo(cancelar);
		ventana.agregaHijo(panel);
		ventana.agregaHijo(cerrar);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creaVentana();
//		Componente componente = ventana.obtenerComponente(100, 100);
//		if (componente == null) {
//			System.out.println("NULL");
//		} else {
//			System.out.println(componente);
//		}
		Componente componente_2 = ventana.obtenerComponente(401, 801);
		if (componente_2 == null) {
			System.out.println("Fuera de la ventana");
		} else {
			System.out.println(componente_2);
		}
		componente_2.muestraAyuda();

//		Componente componente_3 = ventana.obtenerComponente(251, 761);
//		if (componente_3 == null) {
//			System.out.println("Fuera de la ventana");
//		} else {
//			System.out.println(componente_3);
//		}
//		componente_3.muestraAyuda();
	}

}
