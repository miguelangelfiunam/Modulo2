package prinPatrDisCreacional.I03.FactoryMethod.Button;

public class AndroidDialog extends Dialog {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new AndroidButton();
	}

}
