package prinPatrDisCreacional.I03_FactoryMethod.Button;

import java.util.Scanner;



public class Application {
	private static Dialog dialog;
	
	private static void inicializa() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el SO: ");
		String opc = teclado.nextLine();
		switch (opc) {
		case "win":
			dialog = new WindowsDialog();
			break;
		case "mac":
			dialog = new MacDialog();
			break;
		case "lin":
			dialog = new LinuxDialog();
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;
		}
		teclado.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inicializa();
		dialog.clickAction();
		dialog.onMouseClickEventAction();
	}

}
