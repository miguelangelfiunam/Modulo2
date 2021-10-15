package prinPatrDisCreacional.I01_FactoryMethod;

public class Logistics
{
    public void planDelivery() {
        Truck truck = new Truck();
        System.out.println("Setting the plan.");
        truck.deliver();
    }
}
