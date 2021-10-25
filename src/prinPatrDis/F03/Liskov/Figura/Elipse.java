package prinPatrDis.F03.Liskov.Figura;

public class Elipse implements Figura {
	protected double radioMayor;
	protected double radioMenor;
	
	public Elipse(double radioMayor, double radioMenor) {
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * radioMayor * radioMenor;
	}

	public double getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(double radioMayor) {
		this.radioMayor = radioMayor;
	}

	public double getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(double radioMenor) {
		this.radioMenor = radioMenor;
	}

}
