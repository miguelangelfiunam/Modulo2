package prinPatrDisCreacional.I03.FactoryMethod.Button;

public class AndroidButton implements Button{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Click on Android \n");
	}

	@Override
	public void onMouseClickEvent() {
		// TODO Auto-generated method stub
		System.out.println("onMouseClickEvent on Android \n");
	}

}
