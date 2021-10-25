package prinPatrDis.B01_Abstracciones.Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarritoSuper carrito = new CarritoSuper();
		Producto leche_1 = new Leche("SM", "Alpura", 10);
		Producto leche_2 = new Leche("M", "Nido", 15);
		Producto leche_3 = new Leche("M", "Lala", 24);
		Producto leche_4 = new Leche("G", "Santa Clara", 32);
		carrito.agregaProducto(leche_1);
		carrito.agregaProducto(leche_2);
		carrito.agregaProducto(leche_3);
		System.out.println("Total: " + carrito.getTotal());
		carrito.agregaProducto(leche_4);
		System.out.println("Total: " + carrito.getTotal());
		
		Producto papas_1 = new Fritura("C", "Sabritas", 15);
		Producto papas_2 = new Fritura("C", "Takis", 15);
		Producto cereal_1 = new Fritura("C", "Corn Flakes", 65);
		Producto cereal_2 = new Fritura("C", "Zucaritas", 80);
		
		carrito.agregaProducto(papas_1);
		carrito.agregaProducto(papas_2);
		carrito.agregaProducto(cereal_1);
		carrito.agregaProducto(cereal_2);
		System.out.println("Total: " + carrito.getTotal());
	}

}
