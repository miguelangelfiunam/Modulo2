package prinPatrDis.B01_Abstracciones_Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class CarritoSuper {
	private List<Leche> productos;
	private double total;

	public CarritoSuper() {

		this.productos = new ArrayList<Leche>();
		this.total = 0;
	}

	public void agregaProducto(Leche leche) {
		this.productos.add(leche);
	}
	
	public void remuevePorMarca(String marca) {
		this.productos.removeIf(leche -> leche.getMarca().equals(marca));
	}
	
	public void remuevePorPrecio(double precio) {
		this.productos.removeIf(leche -> leche.getPrecio() == precio);
	}


	public double getTotal() {
		double total = 0;
		for (Leche leche : productos) {
			total += leche.getPrecio();
		}
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Leche> getProductos() {
		return productos;
	}

	public void setProductos(List<Leche> productos) {
		this.productos = productos;
	}
}
