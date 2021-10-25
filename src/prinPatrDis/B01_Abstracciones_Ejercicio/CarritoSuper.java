package prinPatrDis.B01_Abstracciones_Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class CarritoSuper {
	private List<Producto> productos;
	private double total;

	public CarritoSuper() {

		this.productos = new ArrayList<Producto>();
		this.total = 0;
	}

	public void agregaProducto(Producto producto) {
		System.out.println("Se agrega " + producto.getMarca() + " al carrito");
		this.productos.add(producto);
	}

	public void remuevePorMarca(String marca) {
		this.productos.removeIf(producto -> producto.getMarca().equals(marca));
	}

	public void remuevePorPrecio(double precio) {
		this.productos.removeIf(producto -> producto.getPrecio() == precio);
	}

	public double getTotal() {
		total = 0;
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
}
