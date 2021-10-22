package prinPatrDis.B01_Abstracciones_Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarritoSuper carrito = new CarritoSuper();
		Leche leche_1 = new Leche("SM", "Alpura", 10);
		Leche leche_2 = new Leche("M", "Nido", 15);
		Leche leche_3 = new Leche("M", "Lala", 24);
		Leche leche_4 = new Leche("G", "Santa Clara", 32);
		carrito.agregaProducto(leche_1);
		carrito.agregaProducto(leche_2);
		carrito.agregaProducto(leche_3);
		System.out.println("Total: " + carrito.getTotal());
		carrito.agregaProducto(leche_4);
		System.out.println("Total: " + carrito.getTotal());
	}

}
