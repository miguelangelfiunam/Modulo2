package prinPatrDisCreacional.I02.FactoryMethod;

public class SpaceLogistic extends Logistic {
	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new NavySpace();
	}

}
