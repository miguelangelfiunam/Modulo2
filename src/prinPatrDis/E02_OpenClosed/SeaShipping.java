package prinPatrDis.E02_OpenClosed;

public class SeaShipping implements Shipping {

	@Override
	public double getCost(Order order) {
		// TODO Auto-generated method stub
		return Double.max(15, order.getTotalWeight() * 2);
	}

}
