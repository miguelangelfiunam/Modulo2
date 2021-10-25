package prinPatrDisCreacional.I03.FactoryMethod.Button;

public abstract class Dialog {
	public void clickAction() {
		Button button = createButton();
		System.out.println("Method: clickAction");
		button.click();
	}
	
	public void onMouseClickEventAction() {
		Button button = createButton();
		System.out.println("Method: onMouseClickEventAction");
		button.onMouseClickEvent();
	}
	
	public abstract Button createButton();
}
