package prinPatrDis.E02_OpenClosed;

public class GroundShipping implements Shipping {

	@Override
	public double getCost(Order order) {
		// TODO Auto-generated method stub

		if (order.getTotal() > 100) {
			return 0;
		}

		return Double.max(10, order.getTotalWeight() * 1.5);
	}

}
