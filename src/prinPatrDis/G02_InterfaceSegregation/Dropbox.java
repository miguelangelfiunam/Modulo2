package prinPatrDis.G02_InterfaceSegregation;

public class Dropbox implements CloudStorage
{
    @Override
    public void storeFile(String name)
    {
        System.out.println("Dropbox is storing file " + name);
    }

    @Override
    public String getFile(String name)
    {
        return "Dropbox file " + name;
    }
}
