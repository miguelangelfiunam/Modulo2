package prinPatrDis.E02_OpenClosed;

public class TestOrder
{
    public static void main(String[] args) {
        Item funkoPopMarx = new Item(1, 569.90, 150, 2);
        Item funkoPopHegel = new Item(2, 450.50, 150, 3);
        Item pin = new Item(3, 55.90, 0.5, 1);
        
        Shipping shipping = new GroundShipping();
        Order order = new Order("MX", shipping);
        order.addItem(pin);
        System.out.println("Costo de envio en MX compra pequena por tierra: " + order.getShippingCost());
        
        shipping = new AirShipping();
        order.setShipping(shipping);
        System.out.println("Costo de envio en MX compra pequena por aire: " + order.getShippingCost());
        
        order.addItem(funkoPopMarx);
        order.addItem(funkoPopHegel);
        order.setShipping(shipping);
        System.out.println("Costo de envio en MX compra grande por aire: " + order.getShippingCost());

        shipping = new GroundShipping();
        order.setShipping(shipping);
        System.out.println("Costo de envio en MX compra grande por tierra: " + order.getShippingCost());

        shipping = new SeaShipping();
        order.setShipping(shipping);
        System.out.println("Costo de envio en MX compra grande por mar: " + order.getShippingCost());
    }
}