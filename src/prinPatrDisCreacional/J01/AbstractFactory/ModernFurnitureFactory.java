package prinPatrDisCreacional.J01.AbstractFactory;

public class ModernFurnitureFactory implements FurnitureFactory
{
    @Override
    public Chair createChair()
    {
        return new ModernChair();
    }

    @Override
    public Table createTable()
    {
        return new ModernTable();
    }

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new ModernSofa();
	}
}
