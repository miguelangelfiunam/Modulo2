package prinPatrDis.G01_InterfaceSegregation;

public class TestCloudProvider
{
    public static void main(String[] args) {
        CloudProvider amazon = new Amazon();
        CloudProvider dropbox = new Dropbox();

        System.out.println("Working with amazon");
        Region region = new Region("US-west-virginia");
        amazon.createServer(region, "Tezcatlipoca");
        amazon.createServer(region, "Huitzilopochtli");
        amazon.listServers(region);
        amazon.storeFile("ventas");
        System.out.println(amazon.getFile("ventas"));
        System.out.println(amazon.getCDNAddress());

        System.out.println("Working with dropbox");
        dropbox.storeFile("tarea");
        System.out.println(dropbox.getFile("tarea"));
    }
}
