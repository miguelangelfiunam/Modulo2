package prinPatrDisCreacional.I03.FactoryMethod.Button;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

}
