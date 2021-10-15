package prinPatrDis.C02_TransporteComposicion;
/**
 * Favorece la composición sobre la herencia
 * 
 * Problemas de la herencia:
 * 		- Las subclases tienen que implementar todos los métodos abstractos de la superclase.
 * 		- Debes asegurar que el nuevo comportamiento es compatible con la clase base cuando sobreescribes un método.
 * 		- La encapsulación de la superclase se rompe.
 * 		- Los cambios en la superclase pueden romper la funcionalidad de las subclases.
 * 		- Puedes terminar creando montones de combinaciones de clases.
 * 
 * @author Miguel Angel Martinez Rivera
 *
 */
public class TestTransport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new CombustionEngine();
		Driver driver = new ManualDriver();
		Transport transport = new Transport(driver, engine);
		transport.deliver("SLP", "Manzanas");

		System.out.println();

		Engine engine_1 = new FusionEngine();
		Driver driver_1 = new AutopilotDriver();
		Transport transport_1 = new Transport(driver_1, engine_1);
		transport_1.deliver("CDMX", "Sandias");

		System.out.println();

		Engine engine_2 = new ElectricEngine();
		Driver driver_2 = new AutopilotDriver();
		Transport transport_2 = new Transport(driver_2, engine_2);
		transport_2.deliver("GDL", "Granadas");
		
		System.out.println();

		Engine engine_3 = new CombustionEngine();
		Driver driver_3 = new ManualDriver();
		Transport transport_3 = new Transport(driver_3, engine_3);
		transport_3.deliver("SIN", "Platanos");
	}

}
