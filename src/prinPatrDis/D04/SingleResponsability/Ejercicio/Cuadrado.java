package prinPatrDis.D04.SingleResponsability.Ejercicio;

public class Cuadrado implements Figura {
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public double calculaArea() {
		double area = lado * lado;
		return area;
	}
}
