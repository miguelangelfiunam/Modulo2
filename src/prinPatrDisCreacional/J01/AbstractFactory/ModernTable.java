package prinPatrDisCreacional.J01.AbstractFactory;

public class ModernTable implements Table
{
    @Override
    public void putSomethingOn(String article)
    {
        System.out.println(article + " was put on a modern table");
    }
}
