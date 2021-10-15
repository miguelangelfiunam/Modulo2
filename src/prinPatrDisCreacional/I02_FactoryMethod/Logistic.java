package prinPatrDisCreacional.I02_FactoryMethod;

public abstract class Logistic {
	public void planDelivery() {
		Transport transport = createTransport();
        System.out.println("Setting the plan.");
        transport.deliver();
	}
	
	public abstract Transport createTransport();
}
