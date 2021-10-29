package prinPatrDis.D04.SingleResponsability.Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura figura = new Circulo(5);
		System.out.println("Calcula area circulo: " + figura.calculaArea());

		figura = new Cuadrado(5);
		System.out.println("Calcula area cuadrado: " + figura.calculaArea());

		figura = new Rectangulo(5, 6);
		System.out.println("Calcula area rectangulo: " + figura.calculaArea());

		figura = new Triangulo(5, 7);
		System.out.println("Calcula area triangulo: " + figura.calculaArea());

	}

}
