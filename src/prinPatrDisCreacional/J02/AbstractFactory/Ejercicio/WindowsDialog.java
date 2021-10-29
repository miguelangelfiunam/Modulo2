package prinPatrDisCreacional.J02.AbstractFactory.Ejercicio;

public class WindowsDialog implements Dialog {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowsCheckbox();
	}

}
