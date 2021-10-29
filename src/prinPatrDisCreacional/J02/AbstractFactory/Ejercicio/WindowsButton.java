package prinPatrDisCreacional.J02.AbstractFactory.Ejercicio;

public class WindowsButton implements Button {

	@Override
	public void implementaBoton() {
		// TODO Auto-generated method stub
		System.out.println("Creando diseño de un boton en Windows");

	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Click de un boton en Windows");
	}

}
