package prinPatrDisCreacional.I02_FactoryMethod;

public class AirLogistic extends Logistic {
	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new Airplane();
	}

}
