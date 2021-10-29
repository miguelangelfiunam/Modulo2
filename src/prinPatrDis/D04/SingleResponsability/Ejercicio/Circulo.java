package prinPatrDis.D04.SingleResponsability.Ejercicio;

public class Circulo implements Figura{
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public double calculaArea() {
		double area = Math.PI * radio * radio;
		return area;
	}
}
