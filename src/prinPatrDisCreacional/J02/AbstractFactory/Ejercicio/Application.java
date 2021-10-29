package prinPatrDisCreacional.J02.AbstractFactory.Ejercicio;

import java.util.Scanner;

public class Application {
	private Dialog operativeSystem;
	private Button button;
	private Checkbox checkbox;

	public void createSet() {
		button = operativeSystem.createButton();
		checkbox = operativeSystem.createCheckbox();
	}

	public void click() {
		button.implementaBoton();
		button.click();
	}
	
	public void check() {
		checkbox.implementaCheck();
		checkbox.check();
	}

	public void initialize(String so) throws Exception {
		if (so.equals("windows")) {
			operativeSystem = new WindowsDialog();
		} else if (so.equals("mac")) {
			operativeSystem = new MacDialog();
		} else {
			throw new Exception("Unknown SO set.");
		}
	}

	public void main(String so) throws Exception {
		this.initialize(so);
		createSet();
		
		click();
		check();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Que SO es (windows/mac): ");
		String system = scanner.next();

		Application application = new Application();

		try {
			application.main(system);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}
