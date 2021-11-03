package prinPatrDis.G04.InterfaceSegregation.Ejercicio;

public class BocinaSamsung implements Bocina, Bluetooth, Disco, Karaoke, Radio {
	private String modelo;

	public BocinaSamsung(String modelo) {
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
		System.out.println("Encendiendo bocina Samsung modelo: " + modelo);
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagando bocina Samsung modelo: " + modelo);
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

	@Override
	public void karaoke() {
		// TODO Auto-generated method stub
		System.out.println("Poniendo karaoke con la bocina " + modelo);
	}

	@Override
	public void radio() {
		// TODO Auto-generated method stub
		System.out.println("Escuchando la radio con la bocina " + modelo);
	}

}
