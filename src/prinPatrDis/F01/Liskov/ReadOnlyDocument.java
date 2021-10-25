package prinPatrDis.F01.Liskov;

public class ReadOnlyDocument extends Document
{
    public ReadOnlyDocument(String fileName)
    {
        super(fileName);
    }

    @Override
    public void save() //throws Exception
    {
        System.out.println("A read-only document cannot be modified and saved.");
//        throw new Exception("A read-only document cannot be modified and saved.");
    }
}
