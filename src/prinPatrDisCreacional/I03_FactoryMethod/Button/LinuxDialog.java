package prinPatrDisCreacional.I03_FactoryMethod.Button;

public class LinuxDialog extends Dialog {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

}
