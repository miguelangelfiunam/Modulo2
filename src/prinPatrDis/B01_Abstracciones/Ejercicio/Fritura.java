package prinPatrDis.B01_Abstracciones.Ejercicio;

public class Fritura implements Producto {
	private String tamanio;
	private String marca;
	private double precio;
	
	public Fritura(String tamanio, String marca, double precio) {
		super();
		this.tamanio = tamanio;
		this.marca = marca;
		this.precio = precio;
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
	
	@Override
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Fritura [tamanio=" + tamanio + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
}
