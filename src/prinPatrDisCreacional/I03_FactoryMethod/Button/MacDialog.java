package prinPatrDisCreacional.I03_FactoryMethod.Button;

public class MacDialog extends Dialog {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

}
