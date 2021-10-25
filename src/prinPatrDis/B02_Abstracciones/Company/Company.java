package prinPatrDis.B02_Abstracciones.Company;
/**
 * Una compañía desarrolla software para lo cual cuenta con una serie de empleados: 
 * diseñadores, programadores, probadores, etc. 
 * Observa el código que se proporciona y refactorízalo. 
 * Piensa que pasa si quiero tener compañías que desarrollen diferentes tipos de software, 
 * por ejemplo, videojuegos, software de sistemas, software de negocios. 
 * Crees que necesite del mismo tipo de empleados o de otros?
 * 
 * @author Java
 *
 */
public class Company
{
    private String name;

    public Company(String name)
    {
        this.name = name;
    }

    public String createSoftware(String systemName) {
        StringBuilder system = new StringBuilder();

        Designer designer = new Designer();
        system.append(designer.designArchitecture(systemName));

        Programmer programmer = new Programmer();
        system.append(programmer.writeCode(systemName));

        Tester tester = new Tester();
        system.append(tester.testSoftware(systemName));

        return system.toString();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}
}
