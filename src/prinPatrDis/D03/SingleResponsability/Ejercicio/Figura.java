package prinPatrDis.D03.SingleResponsability.Ejercicio;

public class Figura {
	public double calculaAreaCirculo(double radio) {
		double area = Math.PI * radio * radio;
		return area;
	}

	public double calculaAreaCuadrado(double lado) {
		double area = lado * lado;
		return area;
	}

	public double calculaAreaTriangulo(double base, double altura) {
		double area = (base * altura) / 2;
		return area;
	}
	
	public double calculaAreaRectangulo(double base, double altura) {
		double area = base * altura;
		return area;
	}
}
