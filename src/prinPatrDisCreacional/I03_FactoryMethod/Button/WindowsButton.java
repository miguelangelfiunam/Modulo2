package prinPatrDisCreacional.I03_FactoryMethod.Button;

public class WindowsButton implements Button {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Click on Windows \n");
	}

	@Override
	public void onMouseClickEvent() {
		// TODO Auto-generated method stub
		System.out.println("onMouseClickEvent on Windows \n");
	}

}
