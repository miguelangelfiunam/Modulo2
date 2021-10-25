package prinPatrDis.B01.Abstracciones.Ejercicio;

public class Leche implements Producto{
	private String tamanio;
	private String marca;
	private double precio;
	
	public Leche(String tamanio, String marca, double precio) {
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
		return "Leche [tamanio=" + tamanio + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
}
