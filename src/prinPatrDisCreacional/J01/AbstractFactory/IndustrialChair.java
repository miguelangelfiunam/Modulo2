package prinPatrDisCreacional.J01.AbstractFactory;

public class IndustrialChair implements Chair
{
    @Override
    public void sitOn(String person)
    {
        System.out.println(person + " is sitting on a industrial chair");
    }
}
