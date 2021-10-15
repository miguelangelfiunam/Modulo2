package prinPatrDis.G02_InterfaceSegregation;

public interface CloudStorage {
	void storeFile(String name);
    String getFile(String name);
}
