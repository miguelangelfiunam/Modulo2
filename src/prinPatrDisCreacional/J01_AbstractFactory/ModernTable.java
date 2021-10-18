package prinPatrDisCreacional.J01_AbstractFactory;

public class ModernTable implements Table
{
    @Override
    public void putSomethingOn(String article)
    {
        System.out.println(article + " was put on a modern table");
    }
}
