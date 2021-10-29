package prinPatrDis.D04.SingleResponsability.Ejercicio;

public class Rectangulo implements Figura {
	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calculaArea() {
		double area = base * altura;
		return area;
	}
}
