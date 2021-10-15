package prinPatrDisCreacional.I02_FactoryMethod;

public class Logistics
{
    public void planDelivery() {
        Transport transport = new Truck();
        System.out.println("Setting the plan.");
        transport.deliver();
    }
}
