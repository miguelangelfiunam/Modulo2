package prinPatrDisCreacional.J01.AbstractFactory;

public class VictorianFurnitureFactory implements FurnitureFactory
{
    @Override
    public Chair createChair()
    {
        return new VictorianChair();
    }

    @Override
    public Table createTable()
    {
        return new VictorianTable();
    }

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new VictorianSofa();
	}
}
