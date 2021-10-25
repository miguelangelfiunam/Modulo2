package prinPatrDis.C02_ComposicionTransporte;

public class Transport {
	Driver driver;
	Engine engine;

	public Transport(Driver driver, Engine engine) {
		this.driver = driver;
		this.engine = engine;
	}

	public void deliver(String destino, String producto) {
		driver.navigate();
		engine.move();
		System.out.println("Llegando a " + destino + " se entregó " + producto);
	}
}
