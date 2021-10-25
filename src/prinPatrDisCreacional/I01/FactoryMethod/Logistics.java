package prinPatrDisCreacional.I01.FactoryMethod;

public class Logistics
{
    public void planDelivery() {
        Truck truck = new Truck();
        System.out.println("Setting the plan.");
        truck.deliver();
    }
}
