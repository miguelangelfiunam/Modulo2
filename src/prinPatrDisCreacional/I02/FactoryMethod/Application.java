package prinPatrDisCreacional.I02.FactoryMethod;

import java.util.Scanner;

/**
 * Método fábrica (Factory method)
 * 
 * Proporciona una interfaz para crear objetos en una superclase, pero permite
 * que las subclases alteren el tipo de objetos que serán creados.
 * 
 * Remplazar las llamadas a new por llamadas a un método fábrica que retorna el
 * producto necesario.
 * 
 * @author Java
 *
 */

public class Application {
	private static Logistic logistic;

	public static void inicializa() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa la logistica: ");
		String opc = teclado.nextLine();
		switch (opc) {
		case "land":
			logistic = new LandLogistic();
			break;
		case "sea":
			logistic = new SeaLogistic();
			break;
		case "air":
			logistic = new AirLogistic();
			break;
		case "space":
			logistic = new SpaceLogistic();
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;
		}
		teclado.close();
	}

	public static void main(String[] args) {
		inicializa();
		logistic.planDelivery();
	}
}
