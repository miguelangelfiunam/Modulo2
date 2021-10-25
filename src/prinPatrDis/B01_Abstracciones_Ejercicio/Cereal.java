package prinPatrDis.B01_Abstracciones_Ejercicio;

public class Cereal implements Producto{
	private String tamanio;
	private String marca;
	private double precio;

	public Cereal(String tamanio, String marca, double precio) {
		this.tamanio = tamanio;
		this.marca = marca;
		this.precio = precio;
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cereal [tamanio=" + tamanio + ", marca=" + marca + ", precio=" + precio + "]";
	}
}
