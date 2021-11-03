package prinPatrDis.G04.InterfaceSegregation.Ejercicio;

public class BocinaSony implements Bocina, Bluetooth, Disco {

	private String modelo;

	public BocinaSony(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo bocina Sony modelo: " + modelo);
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo bocina Sony modelo: " + modelo);
	}

	@Override
	public void bluetooth() {
		// TODO Auto-generated method stub
		System.out.println("Escuchando música por Bluetooth con la bocina " + modelo);
	}

	@Override
	public void cd() {
		// TODO Auto-generated method stub
		System.out.println("Escuchando música de un CD con la bocina " + modelo);
	}

}
