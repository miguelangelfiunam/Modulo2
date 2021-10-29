package prinPatrDis.D03.SingleResponsability.Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura figura = new Figura();
		System.out.println("Calcula area circulo: "+figura.calculaAreaCirculo(5));
		
		figura = new Figura();
		System.out.println("Calcula area cuadrado: "+figura.calculaAreaCuadrado(5));
		
		figura = new Figura();
		System.out.println("Calcula area rectangulo: "+figura.calculaAreaRectangulo(5,6));
		
		figura = new Figura();
		System.out.println("Calcula area triangulo: "+figura.calculaAreaTriangulo(4,7));
		
	}

}
