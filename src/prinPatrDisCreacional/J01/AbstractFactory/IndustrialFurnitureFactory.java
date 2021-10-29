package prinPatrDisCreacional.J01.AbstractFactory;

public class IndustrialFurnitureFactory implements FurnitureFactory
{
    @Override
    public Chair createChair()
    {
        return new IndustrialChair();
    }

    @Override
    public Table createTable()
    {
        return new IndustrialTable();
    }

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new IndustrialSofa();
	}
}
