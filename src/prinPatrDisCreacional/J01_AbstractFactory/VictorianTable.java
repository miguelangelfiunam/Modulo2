package prinPatrDisCreacional.J01_AbstractFactory;

public class VictorianTable implements Table
{
    @Override
    public void putSomethingOn(String article)
    {
        System.out.println(article + " was put on a victorian table");
    }
}
