package prinPatrDisCreacional.J02.AbstractFactory.Ejercicio;

public class WindowsCheckbox implements Checkbox {

	@Override
	public void implementaCheck() {
		// TODO Auto-generated method stub
		System.out.println("Agregando checkbox en Windows");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Check en Windows");
	}

	@Override
	public void unCheck() {
		// TODO Auto-generated method stub
		System.out.println("Uncheck en Windows");
	}

}
