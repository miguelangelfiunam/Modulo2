/**
 * Transport 	- Car		------------------------------------------>Car
 * 							- EngineElectric					
 * 							------------------> -Driver Human	------>ElectricCar
 * 							------------------> -Autopilot		------>AutopilotElectricCar
 * 							- EngineCombustion  				
 * 							------------------> -Driver Human	------>EngineCombustionCar
 * 							------------------> -Autopilot		------>AutopilotEngineCombustionCar
 * 				- Truck		------------------------------------------>Truck
 * 							- EngineElectric    				
 * 							------------------> -Driver Human	------>ElectricTruck
 * 							------------------> -Autopilot		------>AutopilotElectricCar
 * 							- EngineCombustion					
 * 							------------------> -Driver Human	------>EngineCombustionTruck
 * 							------------------> -Autopilot		------>AutopilotEngineCombustionTruck
 * 
 * MUESTRA DE LAS DEBILIDADES DE LA HERENCIA SOBRE LA COMPOSICION
 * 
 * 
 */
package prinPatrDis.C01_ComposicionTransporte;
/**
 * 
 * @author Java
 *
 */
public class TestTransport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport transporte = new Car();
		transporte.move();
		
		Transport transporte_1 = new ElectricCar();
		transporte_1.move();
		
		Transport transporte_2 = new AutopilotCombustionEngineCar();
		transporte_2.move();
		
		Transport transporte_3 = new Truck();
		transporte_3.move();
		
		Transport transporte_4 = new CombustionEngineCar();
		transporte_4.move();
		
		Transport transporte_5 = new AutopilotElectricCar();
		transporte_5.move();
		
	}

}
