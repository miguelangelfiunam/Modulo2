package prinPatrDis.A01_Encapsula;
/**
 * Encapsula lo que cambia
 * 
 * Identifica los principales aspectos que cambian en tu aplicación y sepáralos de aquellos que permanecen igual.
 * 
 * Minimizar el efecto producido por los cambios.
 * 		Encapsulación a nivel de método
 * 		Encapsulación a nivel de clase
 * @author Java
 *
 */
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pais = "MX";
		
		Item item_1 = new Item(1, 10.0, 2);
		Item item_2 = new Item(2, 50.0, 2);
		
		Order orden = new Order(pais);
		orden.addItem(item_1);
		orden.addItem(item_2);
		
		System.out.println("Total: "+orden.getTotal() +" "+ orden.getCountry());
		//------------------------------------------------
		//Se genera una encapsulacion a nivel clase ya que 
		//separamos el impuesto en una clase que posiblemente
		//puede tener nuevos impuestos
		Order2 orden2 = new Order2(pais);
		orden2.addItem(item_1);
		orden2.addItem(item_2);
		
		System.out.println("Total: "+orden2.getTotal() +" "+ orden2.getCountry());
	}

}
