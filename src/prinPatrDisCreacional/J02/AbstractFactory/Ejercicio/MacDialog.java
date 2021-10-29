package prinPatrDisCreacional.J02.AbstractFactory.Ejercicio;

public class MacDialog implements Dialog {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacCheckbox();
	}

}
